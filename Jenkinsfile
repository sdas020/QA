node {
   stage('SCM Checkout'){
       git 'https://github.com/sdas020/QA'  
       }
   stage('Compile-Package'){
      def mvn = tool (name:'MAVEN_HOME', type: 'maven') + '/bin/mvn'   
	   //sh "${mvn} clean package"
   }
       //sh "${mvnHome}/bin/mvn package"
    }
      
