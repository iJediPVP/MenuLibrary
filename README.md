# MenuLibrary
* This library can take in an array of ItemStacks and separate them into multiple pages.

**Usage**
* Create a Menu object: new Menu("MenuName");
* Set the contents: menuObject.setContents(ItemStack[]);
* Set the buttons: menuObject.setButtons(ItemStack exitButton, ItemStack backButton, ItemStack nextButton);
* Open the Menu by using the MenuManager: player.openInventory(new MenuManager().getMenu("MenuName"));