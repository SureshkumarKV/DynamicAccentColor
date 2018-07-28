# DynamicAccentColor
This projects achieves programmatic accent coloring(4 bit RGB) in Android applications. It has 2 parts
* Style XML Generator - A python script to generate a style xml file with all allowed accent colors(4 bit RGB).
* A Java utility - A java class to get the style resource id given ARGB color.

# How does it work?
As of the time this project was developed, Android doesn't allow changing accent colors programatically. There is still provision to append to the current style using the "Context.getTheme().applyStyle()" API.

This project solves the problem of dynamic accent colors by generating a style XML file and providing an API to get the right style given the required color. Since the XML size needs to be kept under check, it uses 4 bit colors for each channel which proved to be sufficient for all practical purposes.

The provided API internally quantizes the incoming color, and then picks the closest style resource and returns the same.
