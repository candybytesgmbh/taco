# TACO
#### [T]he [A]ndroid [C]hallenge :-[O]
Version 1.0


### Instructions
- Fork this repository with your private GitHub account
- After you are finished provide access to your fork for the user "sebastian-hoebarth"
- Please stop if you are hitting the 4 hour time frame
- Try to use libraries that are included in Android Jetpack before using any other 3rd party
- Try to support and use Material Design everywhere possible
- Some parts might be outdated, use wherever you can MVVM, Single Activity and other concepts...
- The challenge is divide in separate parts, complete as much as you can
- 100% Kotlin code
- Good luck & enjoy your tacos 🌮


### Pre-setup
The following structure and libraries are already provided. Please do not start a new project,
use the current setup to continue in order to save time.
##### This repository provides
- A unfinished basic App implementation to start
- Dependency injection with Hilt
- Database access with Room
- REST service client with Retrofit
- List view items
- Basic navigation pattern

##### Links to Libraries you might find helpful
* [Foundation][0] - Components for core system capabilities, Kotlin extensions and support for
  multidex and automated testing.
  * [AppCompat][1] - Degrade gracefully on older versions of Android.
  * [Android KTX][2] - Write more concise, idiomatic Kotlin code.
  * [Test][4] - An Android testing framework for unit and runtime UI tests.
* [Architecture][10] - A collection of libraries that help you design robust, testable, and
  maintainable apps. Start with classes for managing your UI component lifecycle and handling data
  persistence.
  * [Data Binding][11] - Declaratively bind observable data to UI elements.
  * [Lifecycles][12] - Create a UI that automatically responds to lifecycle events.
  * [LiveData][13] - Build data objects that notify views when the underlying database changes.
  * [Navigation][14] - Handle everything needed for in-app navigation.
  * [Room][16] - Access your app's SQLite database with in-app objects and compile-time checks.
  * [ViewModel][17] - Store UI-related data that isn't destroyed on app rotations. Easily schedule
     asynchronous tasks for optimal execution.
  * [WorkManager][18] - Manage your Android background jobs.
* [UI][30] - Details on why and how to use UI Components in your apps - together or separate
  * [Animations & Transitions][31] - Move widgets and transition between screens.
  * [Fragment][34] - A basic unit of composable UI.
  * [Layout][35] - Lay out widgets using different algorithms.
* Third party and miscellaneous libraries
  * [Glide][90] for image loading
  * [Hilt][92]: for [dependency injection][93]
  * [Kotlin Coroutines][91] for managing background threads with simplified code and reducing needs for callbacks

[0]: https://developer.android.com/jetpack/components
[1]: https://developer.android.com/topic/libraries/support-library/packages#v7-appcompat
[2]: https://developer.android.com/kotlin/ktx
[4]: https://developer.android.com/training/testing/
[10]: https://developer.android.com/jetpack/arch/
[11]: https://developer.android.com/topic/libraries/data-binding/
[12]: https://developer.android.com/topic/libraries/architecture/lifecycle
[13]: https://developer.android.com/topic/libraries/architecture/livedata
[14]: https://developer.android.com/topic/libraries/architecture/navigation/
[16]: https://developer.android.com/topic/libraries/architecture/room
[17]: https://developer.android.com/topic/libraries/architecture/viewmodel
[18]: https://developer.android.com/topic/libraries/architecture/workmanager
[30]: https://developer.android.com/guide/topics/ui
[31]: https://developer.android.com/training/animation/
[34]: https://developer.android.com/guide/components/fragments
[35]: https://developer.android.com/guide/topics/ui/declaring-layout
[90]: https://bumptech.github.io/glide/
[91]: https://kotlinlang.org/docs/reference/coroutines-overview.html
[92]: https://developer.android.com/training/dependency-injection/hilt-android
[93]: https://developer.android.com/training/dependency-injection


## Your tasks

###### 1. Navigation & wire frames
Use Jetpack Navigation to navigate between Fragments.
Use ViewModel to hold the content.
Store content in LiveData, access it in views with databinding.

Your main activity UI should look like this:
(use bottom bar navigation to switch between Categories and Search)
![GitHub Logo](/images/structure.png)
Prepare all missing Fragments and the general navigation structure.

###### 2. Web requests
Request and display all taco categories in a list. Show the information in two columns.
Use the remote repository with REST Api. Documentation can be found here:
https://taco-food-api.herokuapp.com/#api-Category-GetCategoriesList

###### 3. Database
Access the local database provided in the App assets to load "food" information.
Load search results based on "description" of a food item. Display search results as a single
column list. Use paging adapters, not load all search results at once into your list.

###### 5. Search
Add a search option into the toolbar, filter database food results by the search term.

###### 6. Category details
Selecting a category in the CategoryListFragment leads the user to the FoodListFragment, showing all 
foods that are added to this category. Show category name at the top, use navigation arguments to 
send information between fragments. Access the food database and query all foods that
have the selected category, again use paging. Display a preview information of a food item. 
Might make sense to use the same 

###### 7. Food details
When selecting a result on SearchFoodFragment or an item in FoodListFragment the detail screen of a food 
(FoodFragment) should be opened. More details of a single food should be displayed on that screen, exactly like
the UI/UX from Figma describes it UI components. (Font, Color, Shape, Size...)

![GitHub Logo](/images/detail.webp)

- Figma UI/UX (free registration required): https://www.figma.com/file/5UjQCIHu8yv9si2tdBiO47/Taco---Detail?node-id=0%3A1

###### 6. Add an image to food detail
Let the user add an Image via an ImagePicker or Camera to a single food item. The image should be stored locally
and displayed on the FoodFragment everytime the user shows the detailed food item.

- Make sure to use ActivityResultContracts. 
- Use a image cache library to display the picture

###### 7. Load category name on food detail screen
Request category name for this food item from web dynamically when its shown on detail screen.
By clicking on the category the user can jump to the category detail page. 




### Some extra candy
#### If you are still eager to complete more tasks go ahead and finish the bonus assignments

###### 🍭 Web requests
On mobile devices internet might fail due to connection issues.
Prepare error indications when content can't be loaded from web.

###### 🍭 Edge to Edge 
Work with display insets and create and edge to edge feeling. Top and bottom bars should fade
away when scrolling in a List view. 
Tip: use helper library from Chris
https://github.com/chrisbanes/insetter

###### 🍭 Create a custom theme
Introduce your custom design for font, colors, small medium and large components.
Tip: checkout material design guidelines
https://material.io/design/material-studies/fortnightly.html#shape

###### 🍭 Memory leak
Finding memory leaks is a very important task when developing high quality apps. 
Make sure there is no memory leak. I might have inserted one ;-)
Tip: there is a nice library for detecting leaks
https://square.github.io/leakcanary/

###### 🍭 Performance
Developing apps for all kind of devices is essential on Android and therefore performance 
optimization is crucial. Initialize all necessary libraries before Application.onCreate() is executed.
Move your DB initialization into a content provider, checkout this helper library
https://developer.android.com/topic/libraries/app-startup

###### 🍭 Deep linking
Make a single taco category accessible via url (e.g: https://taco-food-api.herokuapp.com/api/v1/category/1)

###### 🍭 Fragment transitions
Use Material motion transitions of your choosing to transform between fragments.
Take a look at material components API

- Tip: https://codelabs.developers.google.com/codelabs/material-motion-android


## 🏁 Congratulation you finished the challenge 🏁
#### Make sure everything is pushed to your git repository. Please send us an update about your finished project.
#### Tip: don't forget about code documentation
