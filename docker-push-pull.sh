
cd backend-config-services
mvn clean install -DskipTests-true
docker build -t altobert/backend-config-services .
docker push altobert/backend-config-services
cd ../


cd backend-estudiantes-services
mvn clean install -DskipTests-true
docker build -t altobert/backend-estudiantes-services .
docker push altobert/backend-estudiantes-services
cd ../


cd backend-gateway-services
mvn clean install -DskipTests-true
docker build -t altobert/backend-gateway-services .
docker push altobert/backend-gateway-services
cd ../


cd backend-cuotas-services
mvn clean install -DskipTests-true
docker build -t altobert/backend-cuotas-services .
docker push altobert/backend-cuotas-services
cd ../


cd backend-eureka-services
mvn clean install -DskipTests-true
docker build -t altobert/backend-cuotas-services .
docker push altobert/backend-cuotas-services
cd ../


cd frontend-service
docker build -t altobert/frontend-service .
docker push altobert/frontend-service
cd ../

