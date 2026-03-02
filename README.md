<h1 align="center">Hi 👋, I'm Ayush Ranjan</h1>
<h3 align="center">Java & Spring Boot Developer | JWT Auth Enthusiast | Full Stack Dev</h3>

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=24&duration=3000&pause=800&color=7AA2F7&center=true&vCenter=true&width=700&lines=Building+Secure+Spring+Boot+Apps;JWT+Authentication;Full+Stack+Development" alt="Typing SVG"/>
</p>

<p align="center">
  <a href="https://github.com/ayushRanjan4/jwt-login-system/stargazers"><img src="https://img.shields.io/github/stars/ayushRanjan4/jwt-login-system?style=social" alt="GitHub stars"/></a>
  <a href="https://github.com/ayushRanjan4/jwt-login-system/network/members"><img src="https://img.shields.io/github/forks/ayushRanjan4/jwt-login-system?style=social" alt="GitHub forks"/></a>
  <a href="https://github.com/ayushRanjan4/jwt-login-system/issues"><img src="https://img.shields.io/github/issues/ayushRanjan4/jwt-login-system" alt="GitHub issues"/></a>
  <a href="https://github.com/ayushRanjan4/jwt-login-system/pulls"><img src="https://img.shields.io/github/issues-pr/ayushRanjan4/jwt-login-system" alt="GitHub pull requests"/></a>
</p>

---

## 🌟 Project: JWT Login System - Spring Boot

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2-green)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)
![JWT](https://img.shields.io/badge/JWT-Secure-orange)
![License](https://img.shields.io/badge/License-MIT-yellow)

A **full-stack authentication system** built with **Spring Boot**, **JWT**, and **MySQL**. Users can **register and login using username or email**, and get a **secure JWT token** for stateless authentication. Includes password encryption, JWT validation, and optional forgot password functionality.

---

## 🔥 Features

- ✅ User **registration** with username, email, and password  
- ✅ **Login** using username or email  
- ✅ **JWT token** generation and validation  
- ✅ **Password hashing** using BCrypt  
- ✅ **Spring Security** integration  
- ✅ Stateless session management  
- ✅ Optional **Forgot Password** functionality  

---

## 🛠️ Tech Stack

| Layer             | Technology                                      |
|------------------|------------------------------------------------|
| Backend           | Java 17, Spring Boot, Spring Security         |
| Database          | MySQL 8                                        |
| Authentication    | JWT (JSON Web Token)                           |
| Password Security | BCryptPasswordEncoder                           |
| Build Tool        | Maven                                          |

---

## 📂 Project Structure

src/main/java/com/ayush/authBackend  
│  
├── config          # Security & Password configurations (PasswordConfig, SecurityConfig)  
├── controller      # REST Controllers (AuthController)  
├── dto             # Request & Response DTOs (LoginRequest, RegisterRequest, AuthResponse)  
├── entity          # JPA Entities (User)  
├── repository      # Spring Data JPA Repositories (UserRepository)  
├── security        # JWT filter, CustomUserDetailsService & Security configurations  
├── service         # Business logic & JWT handling (AuthService, JwtService)  

src/main/resources  
│  
├── application.properties  # Spring Boot configuration  

pom.xml                    # Maven build file  

---

## ⚙️ How to Run the Application

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/ayushRanjan4/jwt-login-system.git
cd jwt-login-system
