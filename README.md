# AREP8

## Description
In this project I configure a app that generate the [Leibniz Series](https://en.wikipedia.org/wiki/Leibniz_formula_for_%CF%80), this permit us to calculate PI. We do a auto scaling configuration in AWS.

## Docker images
- [orlandogk10/arep8](https://hub.docker.com/repository/docker/orlandogk10/arep8)

## Deploy

### Manual deployment
```
git clone https://github.com/orlandoagk/AREP8.git
cd AREP8
mvn compile
mvn clean package
java -cp target/classes:target/dependency/* edu.eci.arep.leibnizserie.Main
```

### Docker deployment
```
sudo docker run -dp 80:4567 orlandogk10/arep8
```

## Tutorial

1. We build the prototype of the application that generate the Leibniz Series, you can search the code in this repository
2. Here we deploy the solution using Docker (you have the above explication)![image](/images/2.PNG)

## Tecnology Stack
- [Java 8](https://www.java.com/es/download/)
- [Apache Maven](https://maven.apache.org/)
- [Github](https://www.github.com/)
- [AWS](https://aws.amazon.com/es/)
- [Docker](https://www.docker.com/)
- [Docker Hub](https://hub.docker.com/)

## Author
- [orlandoagk - Github](https://www.github.com/orlandoagk)
- [Orlando Gelves - Linkedin](https://www.linkedin.com/in/orlando-antonio-gelves-kerguelen-11445b1a5/)

## References
- [Docker Docs](https://docs.docker.com)

## Licence
This project is licensed under the GNU General Public License v3.0 - see the [LICENSE](/LICENSE) file for more details.