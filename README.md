# Taco challenge
#### Android developer candidates (V1.0)

## Instructions
- Fork this repository with your private GitHub account
- After you are finished provide access to your fork for the user "sebastian-hoebarth"
- Please stop if you are hitting the 4 hour time frame
- Try to use libraries that are included in Android Jetpack before using any other 3rd party
- Try to support and use Material Design everywhere possible
- Some parts might be outdated, use wherever you can MVVM, Single Activity and other concepts...
- The challenge is divide in separate parts, complete as much as you can
- Good luck & enjoy your tacos 🌮

### Tasks

###### 1. Navigation & wire frames
Use Jetpack Navigation to navigate between Fragments.
Use ViewModel to hold the content.
Access content with LiveData in views with databinding.

Your main activity UI should look like this:
MainActivity (use bottom bar navigation to switch between Categories and Search)
<br>    ├ CategoriesFragment</br>
<br>    │    └FoodListFragment</br>
<br>    │        └FoodFragment</br>
<br>    └ SearchFoodFragment</br>
<br>        └FoodFragment</br>
        
Prepare all missing Fragments and the general navigation structure.

###### 2. Web requests
Request and display all taco categories in a list. Show the information in two columns.
Use the remote repository with REST Api. Documentation can be found here:
https://taco-food-api.herokuapp.com/#api-Category-GetCategoriesList

###### 3. Database
Access the local database provided in the App assets to load "food" information.
Load search results based on "description" of a food item. Display search results as a single
column list. Use paging adapters, not load all search results at once into your list.

###### 4. Category details
Selecting a category in the CategoriesFragment leads the user to the FoodListFragment, showing all 
foods that are added to this category. Show category name at the top, use navigation arguments to 
send information between fragments. Access the food database and query all foods that
have the selected category, again use paging. Display a preview information of a food item.  

###### 5. Food details
When selecting a result on SearchFragment or an item in FoodListFragment the detail screen of a food 
(FoodFragment) should be opened. Here you should show more details of the single food, exactly like
the UI/UX from the Figma link is describing it.

- Figma UI/UX file: TODO
- Tip: use a ConstraintLayout

###### 6. Add image to food detail
Let the user add an Image via an ImagePicker or Camera to a single food item. The image should be stored locally
and displayed on the FoodFragment everytime the user shows the detailed food item.

- Make sure to use ActivityResultContracts. 
- Use image cache library to display the picture


###### 7. Load category name on food detail screen
Request category name for this food item from web dynamically when its shown on detail screen.
 
###### 8. Fragment transitions
Use Material motion transitions of your choosing to transform between fragments.
Take a look at material components API

- Tip: https://codelabs.developers.google.com/codelabs/material-motion-android


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


## 🏁 Congratulation you finished the challenge 🏁
#### Make sure everything is pushed to your git repository. Please send us an update about your finished project.
#### Tip: don't forget about code documentation
