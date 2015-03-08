package utilities
  import javaposse.jobdsl.dsl.Job
  public class MyUtilities {
    def addEnterpriseFeature(Job job) {
        job.with {
          description('Arbitrary feature')
       }
    }
  }
