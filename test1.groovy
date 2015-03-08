import utilities.MyUtilities
  MyUtilities.addEnterpriseFeature(job {})

job {
    name 'GitJob'
    scm {
        git('git://github.com/JavaPosseRoundup/job-dsl-plugin')
    }
}
job {
    name 'GitJobForFeatureBranch'
    scm {
        git('git://github.com/JavaPosseRoundup/job-dsl-plugin', 'feature-branch')
    }
}
job {
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

