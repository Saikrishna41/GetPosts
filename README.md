# GetPosts

##### Kotlin
We use Kotlin as a main programming language (~98%).
[Kotlin | Getting started](https://kotlinlang.org/docs/getting-started.html "Kotlin | Getting started")

##### Kotlin Coroutines
We use `suspend` functions to write asynchronious code and *in a process of migrating
the code from using a `LiveData` to using a `Flow`. *
[Coroutines | Getting started](https://kotlinlang.org/docs/coroutines-basics.html "Coroutines | Getting started")
[Kotlin coroutines on Android](https://developer.android.com/kotlin/coroutines "Kotlin coroutines on Android")

##### Dagger Hilt
We use Dagger 2 to manage the dependency injection.
[Dagger | Tutorial](https://dagger.dev/tutorial/ "Dagger | Tutorial")

##### Data binding
We use Data binding to bind models to views. In a newer code we also use
the newer [ViewBinding](https://developer.android.com/topic/libraries/view-binding "ViewBinding") and plan to migrate to it.
[Data Binding](https://developer.android.com/topic/libraries/data-binding "Data Binding")

##### AndroidX
We use a bunch of Android X libraries where the most interesting of those are:
1. [Room](https://developer.android.com/jetpack/androidx/releases/room "Room") database;
2. [WorkManager](https://developer.android.com/jetpack/androidx/releases/work "WorkManager") to manage background tasks;
3. [Play Core](https://developer.android.com/guide/playcore "Play Core") to provide different implmentations of the Map service for different countries;
4. [Lifecycle](https://developer.android.com/jetpack/androidx/releases/lifecycle "Lifecycle") to help to manage the lifecycle of the screens + `LiveData`.

##### GSON
We use GSON to parse the JSON into models although we are aware that there are
better solutions now (looking at Moshi & Kotlinx Serialization).

##### Joda time
We use Joda Time to avoid using of Java 7's date time APIs.

##### Retrofit
We use retrofit to create network API interfaces.
[Retrofit | Getting started](https://square.github.io/retrofit/ "Retrofit | Getting started")

##### okhttp
We use okhttp to send network requests.

##### Firebase
We use a bunch of Firebase libraries: remote-config, messaging, auth, crashlytics,
performance, ml-vision (to parse QR codes);
