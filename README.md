#пояснения

используемый стек:
mysql,
SpringSecurity
SpringCloud (netflix-eureka, gateway)

в api-gateway прописаны rotes

![Server](https://github.com/reshetovProg/spring-micro/assets/94145533/e3f88b19-4169-4ed0-8a30-74b9b2c00789)


логично также было бы использовать:
liquibase
docker

не до конца реализовал покупку товара
не успел сделать миграцию бд с liquibase

сервисы запускать нужно вручную. Еще не разбирался с docker.
Последовательность запуска сервисов:
- EurekaServerApplication
- BankServiceApplication
- ShopServiceApplication
- StockServiceApplication
- AuthServiceApplication
- ApiGatewayApplication
