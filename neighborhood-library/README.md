# Welcome to Asteway's Library of Knowledge!

## Home Screen
Here is my home screen:

<img src="https://github.com/astewayn17/workbook-2/blob/main/neighborhood-library/screenshots/home.png" width="300"/>

## Products Display
Here you can view our available book selection:

<img src="https://github.com/astewayn17/workbook-2/blob/main/neighborhood-library/screenshots/products.png" width="380"/>

## Calculator Error
Here you can see part of my code that shows an error message and an example of it in the console:

<img src="https://github.com/astewayn17/workbook-2/blob/main/neighborhood-library/screenshots/error.png" width="490"/>

## Interesting Code: `toString()`

This is an interesting piece of code called a `toString()` method from my Book class.  
It can directly translate the machine-like code of an object into a human-readable string!

```java
public String toString() {
        return "ID: " + id + ", ISBN: " + isbn + ", Title: \"" + title + "\"" +
                (isCheckedOut ? " (Checked out to: " + checkedOutTo + ")" : "");
    }
