# Welcome to Asteway's Library of Knowledge!

## Home Screen
Here is my home screen:

![Home Screen](https://github.com/astewayn17/workbook-2/blob/main/neighborhood-library/screenshots/home.png)

## Products Display
Here you can view our available book selection:

![Product Screen](https://github.com/astewayn17/workbook-2/blob/main/neighborhood-library/screenshots/products.png)

## Calculator Error
Here you can see part of my code that shows an error message and an example of it in the console:

![Calculator Error](https://github.com/astewayn17/workbook-2/blob/main/neighborhood-library/screenshots/error.png)

## Interesting Code: `toString()`

This is an interesting piece of code called a `toString()` method from my Book class.  
It can directly translate the machine-like code of an object into a human-readable string!

```java
public String toString() {
        return "ID: " + id + ", ISBN: " + isbn + ", Title: \"" + title + "\"" +
                (isCheckedOut ? " (Checked out to: " + checkedOutTo + ")" : "");
    }
