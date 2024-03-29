
https://user-images.githubusercontent.com/47752075/115660936-b369fc00-a30a-11eb-8beb-0a1e32df606a.mov

# A Shopping App

An Android application that guides the user through a simple shopping task. The first screen displays a welcome message, and a button that  takes the user to a second screen where a list of 3 items are presented in a card-based design. The user can add and remove items, and proceed to the checkout screen by pressing on another button when ready to purchase items. On the checkout screen, the user will be able to see the subtotal, the Quebec tax values (TPS and TVQ) and the total amount to be paid.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 

### Prerequisites

Install Android SDK and Android Studio, and Git.

### Installing

First, start out on [this](https://github.com/amyyip-ca/yipshop) website. 
Next, click on the green button that says "Clone or download". 
Copy the [link](https://github.com/aexmy/yipshop) and open Git Bash. 
Change the directory to paste the repository to Android Studio Projects. 
When ready, type in "git clone [link](https://github.com/amyyip-ca/yipshop)" and press "Enter". 

You should now be able to open the project on Android Studio.

## Running the tests

To run automated tests for this system, wait until the build is completed successfully. Next, click "Run app" to get the system started. Make sure to create or select a virtual device. This project should be able to run on most devices since its API level is API 15: Android 4.0.3 (IceCreamSandwich), but I usually run it on the Nexus 6P API 28 2.

Next, you will be shown an emulator with the welcome screen. To get started, press on the "Start shopping" button. The following page shows 3 articles which you can add (+) or remove (-). On the top right of the screen, you can see the subtotal. Next, you can proceed to the checkout screen by pressing on the "Proceed to checkout" button. The screen will show the subtotal, the Quebec tax values (TPS and TVQ) as well as the total amount to be paid. Up navigation has not been implemented.

## Authors

* **Amy Yip** - *Initial work* - [amyyip-ca](https://github.com/amyyip-ca)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

Thank you to Tassia Camoes-Araujo, my programming teacher, and Marissa Gonçalves, a fellow classmate, for the help provided during this project.

In the MenuActivity.java and the CheckoutActivity.java, credit goes to [ReemaRazdan](https://stackoverflow.com/users/2194996/reemarazdan) and [Sawny](https://stackoverflow.com/users/996028/sawny) on [StackOverflow](https://stackoverflow.com/questions/5265913/how-to-use-putextra-and-getextra-for-string-data). I was inspired by them on how to use the putExtra() method as well as the getExtra().
