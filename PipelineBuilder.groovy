class PipelineBuilder{
   def build(){
      bat label: '', script: 'mvn clean install && exit %%ERRORLEVEL%%'
   }
}
return new PipelineBuilder();