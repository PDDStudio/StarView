#StarView
An animated View inspired by StarWars.
This View was extracted from [StarWars.Android by Yalantis](https://github.com/Yalantis/StarWars.Android) and modified as a standalone View which can be perfectly used for animated backgrounds.
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-StarView-green.svg?style=true)](https://android-arsenal.com/details/1/3100)
##Sample
###Screenshot
![](https://raw.githubusercontent.com/PDDStudio/StarView/master/gfx/star_view_previmg.png)

*Check out the [sample build](https://github.com/PDDStudio/StarView/raw/master/starview-demo-build.apk) for a live preview or watch the [sample video on YouTube](https://youtu.be/btYqwkWHgW8)*

##Getting Started

###Include into your Project
Add the following dependency to your project:
```java
dependencies {
    // other dependencies here...
    compile 'com.pddstudio:starview:1.0.0'
}

```

###Include the View into your Layout
Simply add `StarView` on top of your layout:

```xml
<RelativeLayout 
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.pddstudio.starviewdemo.MainActivity">

    <com.pddstudio.starview.StarView
        android:layout_width="match_parent"
        android:layout_height="match_parent" />

    <FrameLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent">

            <ImageView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_centerInParent="true"
                android:src="@drawable/sw_logo"
                android:scaleType="centerInside"
                android:padding="64dp"/>

        </RelativeLayout>

    </FrameLayout>

</RelativeLayout>
```

Make sure to wrap the content of your activity / fragment into an `FrameLayout` to use it on top of `StarView`

###Prepare the rest of your application
- StarView doesn't have any background, so it's recommended to set your Fragment/Activity background color to a darker one

##About & Contact
- In case you've a question feel free to hit me up via E-Mail (patrick.pddstudio@googlemail.com) 
- or [Google+](http://plus.google.com/+PatrickJung42)

##License
```
The MIT License (MIT)

Copyright © 2015 Yalantis, https://yalantis.com
Copyright © 2016 PDDStudio, https://pddstudio.com

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
```