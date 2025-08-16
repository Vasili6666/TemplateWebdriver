# TemplateWithWebDriver

Шаблон проекта для автотестов на Selenide с ручным управлением WebDriver.

## Настройка
1. Скачайте ChromeDriver, совместимый с вашей версией Chrome.
2. Положите его в `C:\ChromeDriver\`.
3. Укажите путь в коде:
   ```java
   System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");


   
#### **Обновите `.gitignore`**
Добавьте исключения для:
- `/chromedriver.exe` (если драйвер лежит в проекте)
- `/test-output/` (отчёты)
- `/temp/`

---

### **Если возникли проблемы**
- **Ошибка доступа**: Используйте [SSH](https://docs.github.com/ru/authentication/connecting-to-github-with-ssh) или [Personal Access Token](https://docs.github.com/ru/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token) вместо пароля.
- **Конфликты**: Если GitHub репозиторий был создан с README, выполните:
  ```bash
  git pull origin main --allow-unrelated-histories
  git push -u origin main
