# Component
Component is a user interface builder library that eliminates the tedious works involved in building UI components programmatically and the need to think about developing for different screen sizes and screen densities.    

Using Component library, UI components can completely and easily be built programmatically without using layout resources (xml). Though you can use layout resources (xml) alongside building components programmatically using Component library, but it's not necessary. Sticking to building UI components programmatically using Component library alone if you are using Component library will help simplify your work.     

Component is primarily based on the formula below, which is enclosed in a utility method named ‘dimen’:       

**dimension = pixel * (densityDPI / DENSITY_DEFAULT)**       

Where, 

**pixel** = value you give to the ‘dimen’ method that gets resolved for different screen densities and screen sizes.  

**densityDPI** = density dots per inch of android device gotten from the display metrics of the device.  

**DENSITY_DEFAULT** = constant from DisplayMetrics. 

**dimension** = actual value the pixel value given to the formula will resolve into after calculation for different screen densities and screen sizes. This value is assigned to any space between two points in a component or space between two components which include length, width, height, breadth and (left, top, right and bottom of padding and margin) of components.          

**Note: You do not need to care about this formula or the ‘dimen’ method if you are using this library because all the works you will need to do with the method have already been done for you in the library. It’s only described here as the core of the library.** 

### ADDING COMPONENT TO ANDROID PROJECT    

Using Gradle;  

Add the repository below to repositories block in your build.gradle (Project: \<Project Name\>) file: 

```java
allprojects { 
	repositories {
		…
		maven {url ‘https://jitpack.io’}
	}
}
```

Add the dependency below to dependencies block in your build.gradle (Module: app) file:    

```java
dependencies {
	implementation ‘com.github.chibuzoio:component:1.0.1’     
}      
```

Click on ‘Sync Now’ or go to File and click on ‘Sync Project With Gradle Files’. The library will be added automatically into your project.    

### USING COMPONENT LIBRARY       

Using the LoginActivity below for illustration:    

![login_activity](https://user-images.githubusercontent.com/61406807/95712101-1001a580-0c5c-11eb-98f4-aeaf1810fc0a.png)         

The code below is responsible for the arrangement of the Activity above: 

```java  
AU.disableDefaultActionBar(this);

VerticalLinearLayout activityContainer = new VerticalLinearLayout(this,
                GenericLayoutParams.MATCH_PARENT, GenericLayoutParams.MATCH_PARENT);
activityContainer.setComponentColor(R.color.whiteColor);

setContentView(activityContainer);

ScrollViewComponent scrollViewComponent = new ScrollViewComponent(activityContainer);

VerticalLinearLayout mainLayoutContainer = new VerticalLinearLayout(this,
                scrollViewComponent, GenericLayoutParams.MATCH_PARENT, GenericLayoutParams.MATCH_PARENT);
mainLayoutContainer.setLayoutGravity(Gravity.CENTER);
mainLayoutContainer.setGravity(Gravity.CENTER);

ImageViewComponent companyLogo =
                new ImageViewComponent(mainLayoutContainer, R.drawable.ymcmart);
companyLogo.setCircularCenterImage(R.drawable.ymcmart);
companyLogo.setImageSize(77.777f);

BorderlessEditText usernameEditText =
                new BorderlessEditText(mainLayoutContainer, R.drawable.icon_user, "Username");
usernameEditText.setMargins(23, 55.555f, 23, 0);

BorderlessEditText passwordEditText =
                new BorderlessEditText(mainLayoutContainer, R.drawable.icon_password, "Password");        
passwordEditText.getBorderlessEditTextView().setEditorInputType(EditTextComponent.INPUT_TYPE_TEXT_PASSWORD);
passwordEditText.setMargins(23, 11.111f, 23, 0);

ButtonComponent loginButton = new ButtonComponent(mainLayoutContainer, "Sign In");
loginButton.setMargins(23, 33.333f, 23, 23);

ButtonComponent signUpButton = new ButtonComponent(mainLayoutContainer, "Sign Up");
signUpButton.setDrawable(AU.curveBackgroundCorner(this, 11.111f, R.color.colorPrimaryDarker));
signUpButton.setMargins(23, 0, 23, 0);

TextViewComponent forgotPasswordTextLink = new TextViewComponent(mainLayoutContainer, "Forgot Password?", 5);
forgotPasswordTextLink.setMargins(23, 15.333f, 23, 33.333f);
forgotPasswordTextLink.setAlignment(TextViewComponent.TEXT_ALIGN_RIGHT);
forgotPasswordTextLink.setTextStyle(TextViewComponent.BOLD_TEXT);
forgotPasswordTextLink.setTextViewColor(R.color.genericLink);
```   

The code snippet above was written in the onCreate method of LoginActivity, but can be isolated as a private method of the activity and called in the onCreate method. Description of the code snippet is as below:

**disableDefaultActionBar** of AU (Activity Utility) class removes the activity’s default ActionBar. 

**activityContainer** is the base component that holds all the components of LoginActivity in place. That’s why it’s set to render all other components of the LoginActivity by setContentView method of LoginActivity. The constructor of **activityContainer** object contains two other parameters which are constants of GenericLayoutParams class. **(Note: Always choose layout params constants (WRAP_CONTENT and MATCH_PARENT) from GenericLayoutParams and not from the LayoutParams class if you are using this library).**   

**Note: Every component takes layout component (like FrameLayout, VerticalLinearLayout, HorizontalLinearLayout, ScrollView and so on) as one of its parameters because the layout component holds the component in position except the first (or base) layout component that is set for the activity by the setContentView method of the activity.**   

**GenericLayoutParams** class takes care of layout management of components. You do not have to concern yourself with what is happening in this class if you are only using the library, unless you are contributing to the development of the library. 

**scrollViewComponent** takes care of scrolling should in case the the components of the LoginActivity grows past the screen size. 

**scrollViewComponent** by convention can only contain one component. So, **mainLayoutContainer** is the only component contained by **scrollViewComponent** and it forms the base container for all other components contained by LoginActivity. 
 
**Note: Instead of setting orientation off from LinearLayout class, the LinearLayout got divided into two types of LinearLayout; HorizontalLinearLayout and VerticalLinearLayout.** 

Setting gravity and layout gravity using this library has been simplified into a single method call. E.g: 

**mainLayoutContainer.setGravity(Gravity.CENTER);**               
**mainLayoutContainer.setLayoutGravity(Gravity.CENTER);**

The two method calls above for setting gravity and layout gravity respectively are responsible for aligning the **mainLayoutContainer** which contains other components to the center of the **scrollViewComponent.** 

From the **mainLayoutContainer** going down, the trend (the simplicity involved in creating UI components) continues downward because **the design goal of Component library is that every component should be designed as a single entity (as one class) throughout the entirety of the project and have its object created and used where ever it’s needed.** Complex components are created by composing other simple or complex components into one component. Some examples of simple components in this library include: DrawerLayoutComponent, FrameLayoutComponent, ViewPagerComponent, EditTextComponent, ScrollViewComponent, TextViewComponent, and ViewComponent. These components are termed simple components because they inherit directly from the known Android UI classes which respectively are: DrawerLayout, FrameLayout, ViewPager, AppCompatEditText, ScrollView, AppCompatTextView and View. On the other hand, some examples of complex components include: HorizontalLinearComponent, VerticalLinearComponent, BorderlessEditText, ButtonComponent and FormFieldComponent. The first two complex components inherit directly from LinearLayoutComponent, while the last three inherit from VerticalLinearComponent. These complex components are also composed of other simple or complex components.  

All the components created in this library will be discussed going forward. **To be continued……**    
