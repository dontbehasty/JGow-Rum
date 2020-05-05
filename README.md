# JGow-Rum

<h2>Main Home Screen</h2>

<img src="/Screenshots/image1.png" width="200"/>

---

<h2>About Button</h2>
Uses the goToTheOtherActivity Intent to open a new tabbed activity.
On this tabbed activity there is 3 tabs. For each of the tabs a different fragment will be displayed.
<br><br>

<div>
  <img src="/Screenshots/image4.png" height="300"/> &nbsp
  <img src="/Screenshots/image6.png" height="300"/> &nbsp
  <img src="/Screenshots/image5.png" height="300"/>
</div>

---

<h2>Cocktail List Button</h2>
Uses the goToTheOtherActivity Intent to open a new activity.
On this activity there is a ListView which displays a list of cocktails.
When an item on the list is selected it will open a new activity and display information about that cocktail. 
This information comes from several different arrays.
<br><br>

<div>
  <img src="/Screenshots/image2.png" height="300"/> &nbsp
  <img src="/Screenshots/image3.png" height="300"/>
</div>

---

<h2>Visit Website Button</h2>
Uses launchBrowser and ACTION_VIEW to open the web browser and go to the J.Gow Rum website.
<br><br>

```java
websiteButton.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Uri jgWeburl = Uri.parse("https://jgowrum.com/");
           Intent launchBrowser = new Intent(Intent.ACTION_VIEW, jgWeburl);
           startActivity(launchBrowser);
       }
});
```

---

<h2>Email Button</h2>
Uses emailIntent ACTION_SEND to open the email app and also uses EXTRA_EMAIL and EXTRA_SUBJECT to fill in the J.Gow Rum email address and the email subject.
<br><br>

```java
emailButton.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         Intent emailIntent = new Intent(Intent.ACTION_SEND);
         emailIntent.setType("plain/text");
         emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"info@vsdistillersltd.com"});
         emailIntent.putExtra(Intent.EXTRA_SUBJECT, "J.Gow Rum Query");
         startActivity(emailIntent);
     }
});
```

---

<h2>Call Button</h2>
Uses callIntent and ACTION_DIAL to display the phone dialer with the phone number filled in.
<br><br>

```java
callButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
       Uri jgPhoneNumber = Uri.parse("tel:01856781714");
       Intent callIntent = new Intent(Intent.ACTION_DIAL, jgPhoneNumber);
       startActivity(callIntent);
    }
});
```

---

<h2>Demo</h2>

<img src="/Screenshots/J Gow Rum App - Demo.gif" height="500"/>
