sudo apt update
sudo apt install maven -y

mvn archetype:generate \
-DgroupId=com.example.app \
-DartifactId=demo-app \
-DarchetypeArtifactId=maven-archetype-quickstart \
-DinteractiveMode=false

cd demo-app

demo-app/
 ├── pom.xml
 └── src/
     ├── main/java/com/example/app/App.java
     └── test/java/com/example/app/AppTest.java



mvn clean package

mvn exec:java -Dexec.mainClass="com.example.app.App"

sudo rm -rf ~/.jenkins
sudo rm jenkins.war

sudo apt update
sudo apt install openjdk-22-jdk -y
wget https://get.jenkins.io/war-stable/latest/jenkins.war
java -jar jenkins.war --httpPort=8084


sudo apt install snapd -y
sudo snap install ngrok


git config --global user.name "Your Name"
git config --global user.email "youremail@example.com"

git init
git add .
git commit -m "Initial commit"

git branch -M main
git remote add origin https://github.com/USERNAME/REPO.git

git push -u origin main