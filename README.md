# 🚀 **Gradle BOM Demo**  
A simple set of applications showcasing the power of **Gradle BOM (Bill of Materials)** for dependency version management.

## 📌 **Overview**  
This project demonstrates how to use **Gradle BOM** to efficiently manage dependency versions across multiple modules.  

### 📂 **Project Structure**  
- 🏗 **`alpha-bom`** → A platform repository defining common library versions.  
- 📦 **`library-a`** → A top-level library providing core functionality.  
- 🔗 **`library-b`** → A middle-level library that depends on `library-a`.  
- 🚀 **`demo-engine`** → The final application that depends on both `library-a` and `library-b`.  

---

## ⚙️ **Getting Started**  

### ✅ **Prerequisites**  
Ensure you have the following installed:  
- ☕ **Java 17+**  
- 🛠 **Gradle 8+**  

### 🔧 **Setup**  
Clone the repository and navigate into the project directory:  
```sh
git clone https://github.com/your-username/gradle-bom-demo.git
cd gradle-bom-demo
```

---

## 🏗 **Building the Project**  
To build all modules, run (for each inner project):  
```sh
gradle build
```

To publish the BOM and libraries to your **local Maven repository** (for each inner project):  
```sh
gradle publishToMavenLocal
```

---

## 📜 **How BOM Works in This Project**  
- The **`alpha-bom`** module **centralizes version management** for all dependencies.  
- Other modules **import `alpha-bom`**, ensuring consistent dependency versions across projects.  
- **No need to manually specify versions** in dependent modules—they are inherited from `alpha-bom`.  

### ✨ **Example Usage in `build.gradle` of `library-a`**  
```groovy
dependencies {
    implementation platform("com.example:alpha-bom:1.0.0")  // Import BOM
    implementation "com.example:library-a"     // No need to specify version!
}
```

---

## 🤝 **Contributing**  
We welcome contributions! Feel free to:  
- 🛠 **Fork** this project  
- 🔄 **Submit pull requests**  
- 💡 **Suggest improvements**  

---

### 📜 **License**  
This project is licensed under the **MIT License**.
