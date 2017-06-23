# springboot-gradle-jarvis-akshata

1. Install JDK on your system.  Preferred 1.8
2. Install Spring Tool Suite
3. Install GitHub on Desktop or you can prefere to use the cloud version of GitHub. 
   a.  create an account for both offline and online installations
   b.  Use the repository link: https://github.com/smakshata/springboot-gradle-jarvis-akshata and import the project under your repository by creating a new repository name
4. Import the GitHub project you just created on eclipse/spring tool suite, using import from github plugin
5. Install Jira on you laptop and set up JAVA_HOME environment variable for your system pointing to jdk home installation directory
   a.  Start Jira using C:\JIRA_INSTALLATION_DIR\bin\start-jira.bat. open in browser using localhost:8080
       Create Jira Account administrator
   b.  Create Jira user account
   c.  Create a project under Jira and start creating tasks and assign to team members
6. Install Bamboo
   a.  Start Bamboo using C:\Bamboo_install_dir\bin\start-bamboo.bat
   b.  Access Bamboo using localhost:8085
   c.  Create Bamboo Account
   d.  Create a Project plan and build plan
   e.  Create build tasks like: CVS checkout, gradle build, tomcat war undeployment, deployment
7. Install Tomcat
   a.  Change the tomcat port to 9090 in server.xml file under catalina_home/conf/server.xml (as jira using port 8080)
8. Install Sonarqube 
   a.  Start sonar from C:\sonar_unzipped_dir\bin\osinstalltype_dir\bin\StartSonarqube.bat
   b.  Access sonar at : localhost:9000
9. In the gradle build file of your project provide the sonar plugin
   a.  analyze your code using 'gradle build sonarqube' command
10. Run your bamboo for a successful build plan
   a. your application can be opened at : localhost:9090/jarvis/swagger-ui.html
