package utilities
  import javaposse.jobdsl.dsl.Job
  public class MyUtilities {
    def addEnterpriseFeature(Job job) {
        job.with {
		  name('myname')	
          description('Description')
       }
    }
  }
