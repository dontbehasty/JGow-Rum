# JGow-Rum

This app has 5 button on the main screen.

<img src="/Screenshots/image1.png" width="200"/>

---

About J.Gow Rum Button:
Uses the goToTheOtherActivity Intent to open a new tabbed activity.
On this tabbed activity there is 3 tabs. For each of the tabs a different fragment will be displayed.

<div>
  <img src="/Screenshots/image4.png" height="300"/> &nbsp
  <img src="/Screenshots/image6.png" height="300"/> &nbsp
  <img src="/Screenshots/image5.png" height="300"/>
</div>

---

Cocktail List Button:
Uses the goToTheOtherActivity Intent to open a new activity.
On this activity there is a ListView which displays a list of cocktails.
When an item on the list is selected it will open a new activity and display information about that cocktail. 
This information comes from several different arrays.

<div>
  <img src="/Screenshots/image2.png" height="300"/> &nbsp
  <img src="/Screenshots/image3.png" height="300"/>
</div>

---

Visit Website Button:
Uses launchBrowser and ACTION_VIEW to open the web browser and go to the J.Gow Rum website.

---

Email Button:
Uses emailIntent ACTION_SEND to open the email app and also uses EXTRA_EMAIL and EXTRA_SUBJECT to fill in the J.Gow Rum email address and the email subject.

---

Call Button:
Uses callIntent and ACTION_DIAL to display the phone dialer with the phone number filled in.
