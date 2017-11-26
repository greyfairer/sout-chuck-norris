To build: 

  gradle build
  or: ./gradlew.bat build

To run locally:

  gradle bootRun
  
To build the docker image, change the tag in the build.gradle and then:

  gradle buildDocker
  
To run the docker image afterwards

  docker run <tag>
  
