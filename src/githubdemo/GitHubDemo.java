package githubdemo;

public class GitHubDemo {

    public static void main(String[] args) {

        System.out.println("Learning Github");

    }

}
/*
**Step1 -- creating a local repository
*right click on the project -- versioning -- initialize the git repository -- click Ok
*a container appears on the project, which means github is enabled
*this creates a hidden .git folder(i.e. repository) at the same place where the project is saved but we cannot see it unless we enable the 
option of seeing all the hidden files, but we don't need to do anything with it

**Step2 --
*right click on project -- git --repository -- open global configuration
*In the .gitconfig folder write the following 3 lines
[user]
name=(your github username)
email=(youtr github email)

**Step3 -- creating new file
*right click -- new -- other -- in the categories go down choose other -- in the file types choose empty file
*click next -- give file a name as .gitignore -- click finish
MEANING OF THIS FILE
git : used to track the changes on code
There are some folders and files which we do not want to track, so we can add those files and folders to .gitignore file
There are some standard files in IDE which are not important so we don't need to track them to save our time
**TO ADD THOSE FILES
*search gitignore.io on browser -- add NetBeans -- press create
*whatever comes copy everything and paste it in .gitignore file

**STEP4 -- if we write any code in netbeans -- we need to commit it in LR(local repository)
save in netbeans is different from saving it in local repository
to save it in local repository -- we use the comand commit
right click on project -- git -- commit
we can give any message
press commit
*/
