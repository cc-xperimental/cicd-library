properties([
  parameters([
    [
      $class: 'ChoiceParameter',
      choiceType: 'PT_SINGLE_SELECT',
      name: 'Environment',
      script: [
        $class: 'GroovyScript',
        script: [
          classpath: [], 
          sandbox: false, 
          script: "return['dev','stage','prod']"
        ]
      ]
    ]/*,
    [
      $class: 'CascadeChoiceParameter',
      choiceType: 'PT_SINGLE_SELECT',
      name: 'Host',
      referencedParameters: 'Environment',
      script: [
        $class: 'GroovyScript',
        script: [
          script: '''
          '''
        ]
      ]
   ]*/
 ])
])

pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo "${params.Environment}"
        echo "${params.Host}"
        echo "is master? ${isMasterBranch()}"
      }
    }
  }
}
