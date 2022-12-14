node('linux')
{
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/ZOSOpenTools/pipelineport.git'), string(name: 'PORT_DESCRIPTION', value: 'libpipeline is a C library for setting up and running pipelines of processes, without needing to involve shell command-line parsing which is often error-prone and insecure' )]
  }
}
