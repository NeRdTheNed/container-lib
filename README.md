# NinjaPhenix's container library
Provides an easy way to view modded block's inventory. As long as they implement InventoryProvider

## How to use

- Make a local repository and add the mod to the workspace. The ninjaphenix-container-lib jar should be inside of the flatDir directory `includes` in the example below.
```groovy
repositories {
    flatDir { dirs "includes" }
}
dependencies {
    modApi "ninjaphenix:ninjaphenix-container-lib:0.0.1"
    include "ninjaphenix:ninjaphenix-container-lib:0.0.1"
}
```
- Within your code to open a block's inventory call ( You need to check if the player should be allowed to open the inventory )
```java
    ContainerLibrary.openContainer(player, blockPos, containerName);
```
- Profit, for an example of all this see ExpandedStorageAPI (insert link)

## License
Mit No Attribution