# Obsidian Armor

A Fabric mod for Minecraft **1.20.1** that adds a full **Obsidian Armor** set.

## Features
- **Obsidian Ingot** — smelt vanilla Obsidian blocks in a **Blast Furnace**.
- **Obsidian Helmet, Chestplate, Leggings, Boots** — crafted from Obsidian Ingots.
- Wearing the **full set** grants **Fire Resistance** but applies **Slowness** (the weight of solid obsidian).

## Recipes
- Smelt `minecraft:obsidian` in a Blast Furnace → Obsidian Ingot.
- Craft the armor pieces with the usual armor-shaped patterns using Obsidian Ingots.

---

## How to build the mod (NO Java install needed — GitHub builds it for FREE)

You do **not** need to install Java or Gradle. GitHub will build the `.jar` for you automatically.

### Step-by-step

1. **Create a GitHub account** at https://github.com (free).
2. Click the **+** in the top-right → **New repository**. Give it any name, keep it **Public** (or Private), and click **Create repository**.
3. On the new empty repo page, click the link **"uploading an existing file"**.
4. **Extract the ZIP** you downloaded (double-click it) so you get a folder with the project files inside.
5. **macOS users — IMPORTANT:** The `.github` folder is **hidden by default** and holds the build workflow. In Finder, press **Cmd + Shift + .** (period) to **show hidden files**. If you skip this, the `.github` folder will NOT be uploaded and the build will **never run**.
6. Open the extracted folder. Select **ALL files and folders INSIDE it** — including the hidden **`.github`** folder, `build.gradle`, `gradle.properties`, `settings.gradle`, `src`, and everything else.
   - Drag the **contents** of the folder into the GitHub upload area.
   - **Do NOT drag the folder itself** — drag what's inside it.
7. Scroll down and click **Commit changes**.
8. Click the **Actions** tab at the top of your repo. You'll see the **Build** workflow running.
9. Wait about **~2 minutes** until it finishes with a green check.
10. Click the finished workflow run → scroll to **Artifacts** → download **`mod-jar`**.
11. Unzip the artifact and copy the `.jar` into your Minecraft mods folder:
    - Windows: `%appdata%\.minecraft\mods\`
    - macOS: `~/Library/Application Support/minecraft/mods/`
    - Linux: `~/.minecraft/mods/`
12. Make sure you also have **Fabric Loader** and **Fabric API** installed for Minecraft **1.20.1**.

Launch Minecraft with the Fabric profile and enjoy your Obsidian Armor!

---

## License
MIT