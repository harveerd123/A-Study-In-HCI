READ ME

Half Unit Project (Folder: halfunitproject)
This directory consists of interfaces created in relation to doing a project in the topic: A study in Human-Computer Interaction (HCI).
Three interfaces have been made in this study, these are an Android/Windows App found in the AndroidApp folder, a GUI found in the GUI folder and a 
Website found in the Website folder. Three Proof Of Concept programs/interfaces were also created to prove that I was able to use the software I 
choose and implement what I planned to. These can be located in AppDemo, GUIDemo and WebpageDemo. I have also added a Documents folder in this 
directory to add my report in and BDD Tests done for all these interfaces.
Below we will discuss what exactly these interfaces do and the structure found in their folders.

Android/Windows App (Folder: AndroidApp)
The android/windows app created allows you to browse a restaurant's menu and place an order. It can be deployed on either Windows or Android. 
The directory consists of a trunk, branch and tags folder. Inside the trunk file you will find the main source code, the branch folder was used
to create branches and implement features/changes to the trunk without affecting it. The tags folder consists of versions of the main files (trunk).
Inside the trunk folder you will find a AndroidApp folder. Inside this folder you will find another AndroidApp folder and a AndroidApp.Android folder
, a AndroidApp.UWP folder and a AndroidApp.iOS folder. Inside the AndroidApp folder you will find all the code used to design the app and add 
functionality(Views, ViewModels). The AndroidApp.UWP and AndroidApp.Android folders enable you to run the program on your desired interface. They 
also consist of folders which have the assets such as images used in the project as each interface requires its assets in different locations for it
to load. The AndroidApp.iOS folder most likely wont work for iOS devices due to the assets not being added correctly for it.
In order to get this app running on your device you will have to load the AndroidApp.sln file (found in the trunk folder) into Visual Studios, from
there you will be able to pick how to run it (Android or Windows). 

GUI (Folder: GUI)
The GUI created allows you to access a database and easily view and edit information as you like. It is deployed on a computer by running a java ran
program (JAR). The directory consists of a trunk, branch and tags folder. Inside the trunk file you will find the main source code, the branch folder was used
to create branches and implement features/changes to the trunk without affecting it. The tags folder consists of versions of the main files (trunk).
Inside the trunk folder if you access the src folder and then the gui folder you will find each window present in the GUI. Each window present on 
this GUI is added as a separate java file with each having its functionality and design in that file. 
In order to get the GUI running on your device you will have to install the Jar file found in the src folder named GUI.jar.

Website (Folder: Website)
The website created allows you to access a clothing store’s products and purchase them. It can be deployed on a computer which has a web browser 
installed. The directory consists of a trunk, branch and tags folder. Inside the trunk file you will find the main source code, the branch folder was used
to create branches and implement features/changes to the trunk without affecting it. The tags folder consists of versions of the main files (trunk).
Inside the trunks folder you will find a WebContent folder which consists of all the HTML files which outline the layout of the pages and CSS files 
which allow you to design elements on these pages. Each page has their own HTML file and a corresponding CSS file it is linked to.
In order to get the website running on your device you will have to download the whole of the WebContent folder and open the MainPage.html file using
a web browser, then from here you will be able to access all the website.

Android/Windows App Proof Of Concept (Folder: AppDemo)
The android/windows proof of concept app created allows you to press 3 different buttons and each do a different action. It can be deployed on either
Windows or Android. The directory consists of a trunk, branch and tags folder. Inside the trunk file you will find the main source code, the branch 
folder was used to create branches and implement features/changes to the trunk without affecting it. The tags folder consists of versions of the main
files (trunk). Inside the trunk you will find a DemoApp and Testing folder. The Testing folder is where all the TDD tests where done for this program
and the DemoApp folder will consist of 3 different folders inside it. Inside the DemoApp folder you will find another DemoApp folder which will 
consist of all the different views on this app, and the design and functionality implemented on them. There will also be a DemoApp.Android folder,
DemoApp.iOS and DemoApp.UWP folder which enable you to run the program on your desired interface. These folders also consist of folders which have 
the assets such as images used in the project as each interface requires its assets in different locations for it to load. The DemoApp.iOS folder 
most likely wont work for iOS devices due to the assets not being added correctly for it. 
In order to get this app running on your device you will have to load the DemoApp.sln file (found in the trunk folder) into Visual Studios, from
there you will be able to pick how to run it (Android or Windows). 

GUI Proof Of Concept (Folder: GUIDemo)
The GUI proof of concept program allows you to click 2 different buttons each taking you to different windows. It is deployed on a computer by 
running a java ran program (JAR). The directory consists of a trunk, branch and tags folder. Inside the trunk file you will find the main source code, the branch folder was used
to create branches and implement features/changes to the trunk without affecting it. The tags folder consists of versions of the main files (trunk).
Inside the trunk you will find a src folder and then another folder named guidemo. It is here where each window of the GUI is present. Each window 
present on this GUI is added as a separate java file with each having its functionality and design in that file. 
In order to get the GUI running on your device you will have to install the Jar file found in the src folder named GUIDemo.jar.


Website Proof Of Concept (Folder: WebpageDemo)
The website proof of concept program provides a page to view with 3 different buttons in a navigation bar however no functionality is added. It can 
be deployed on a computer which has a web browser installed. The directory consists of a trunk, branch and tags folder. Inside the trunk file you 
will find the main source code, the branch folder was used to create branches and implement features/changes to the trunk without affecting it. 
The tags folder consists of versions of the main files (trunk). If you enter the trunk folder and then inside WebContent it is here that you will 
find all the HTML files which outline the layout of the pages and CSS files which allow you to design elements on these pages. Each page has their
own HTML file and a corresponding CSS file it is linked to. 
In order to get the website running on your device you will have to download the whole of the WebContent folder and open the MainPage.html file using
a web browser.








