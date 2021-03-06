import utilities.MyUtilities
  

j1 = job {
    name 'GitJob'
    scm {
        git('git://github.com/JavaPosseRoundup/job-dsl-plugin')
    }
}

myutil = new MyUtilities.addEnterpriseFeature(j1)

j2 = job {
    name 'GitJobForFeatureBranch'
    scm {
        git('git://github.com/JavaPosseRoundup/job-dsl-plugin', 'feature-branch')
    }
}

j3 = job {
    name 'GitJobXmlConfigured'
    scm {
        git('git://github.com/JavaPosseRoundup/job-dsl-plugin') { node ->
            // These names come straight from the xml, <scm class="hudson.plugins.git.GitSCM">
            node / authorOrCommitter << 'true'
            node / gitConfigName << 'Justin Ryan'
            node / gitConfigEmail << 'justin@halfempty.org'
        }
    }
}

