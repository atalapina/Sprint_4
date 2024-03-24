# Sprint_4
## запуск в Chrome

```bash
mvn test
```
## запуск в FireFox
Если mvn test падает с ошибкой 500, и не находит бинарник, то запускаем с параметром

```bash
mvn -Dbrowser=firefox -Dwebdriver.firefox.bin="C:\Program Files\Mozilla Firefox" test 
```