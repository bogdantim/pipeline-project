class Pipeline{
   def build(){
      bat label: '', script: 'mvn clean install && exit %%ERRORLEVEL%%'
   }
}