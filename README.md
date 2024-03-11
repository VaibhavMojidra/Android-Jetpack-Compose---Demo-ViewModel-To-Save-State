# Android Jetpack Compose Demo ViewModel To Save State

In Android development, ViewModel is a part of the Android Architecture Components library. It's designed to store and manage UI-related data in a lifecycle-conscious way, allowing data to survive configuration changes such as screen rotations.
While Jetpack Compose itself is a declarative UI toolkit, the ViewModel plays a crucial role in separating concerns related to data handling and UI presentation.

### Why ViewModel for saving state?
Even though we have `rememberSaveable{}` in Android for saving changes during configuration changes, it is still not recommended for large data collections like lists, as it increases the time required for serialization and deserialization processes (Serialization and deserialization are processes used in computer science to convert data structures or objects into a format that can be easily stored, transmitted, or reconstructed later). Therefore, in such cases, we need to use ViewModel to save the state. In this example, we have only one integer value, but in real-world apps, we can have a large amount of data.

---

[![Vaibhav Mojidra - 1.jpeg](https://raw.githubusercontent.com/VaibhavMojidra/Android-Jetpack-Compose---Demo-ViewModel-To-Save-State/master/screenshots/1.jpeg "Vaibhav Mojidra")](https://vaibhavmojidra.github.io/site/)

[![Vaibhav Mojidra - 2.jpeg](https://raw.githubusercontent.com/VaibhavMojidra/Android-Jetpack-Compose---Demo-ViewModel-To-Save-State/master/screenshots/2.jpeg "Vaibhav Mojidra")](https://vaibhavmojidra.github.io/site/)

[![Vaibhav Mojidra - 3.jpeg](https://raw.githubusercontent.com/VaibhavMojidra/Android-Jetpack-Compose---Demo-ViewModel-To-Save-State/master/screenshots/3.jpeg "Vaibhav Mojidra")](https://vaibhavmojidra.github.io/site/)