 ​import​ ​java​.​util​.*; 
 ​import​ ​javax​.​mail​.*; 
 ​import​ ​javax​.​mail​.​internet​.*; 
  
 ​public​ ​class​ ​Mailer​ { 
 ​        ​public​  ​boolean​ ​mailSending​(​String​ ​sender​,​String​ ​pass​,​String​ ​receiver​, ​String​ ​subject​,​String​ ​message​) 
 ​        { 
 ​                ​Properties​ ​props​=​new​ ​Properties​(); 
 ​                ​props​.​put​(​"mail.smtp.host"​,​"smtp.gmail.com"​); 
 ​                ​props​.​put​(​"mail.smtp.port"​, ​"465"​); 
 ​                ​props​.​put​(​"mail.smtp.ssl.enable"​, ​"true"​); 
 ​                ​props​.​put​(​"mail.smtp.auth"​, ​"true"​); 
 ​                ​props​.​put​(​"mail.smtp.ssl.protocols"​, ​"TLSv1.2"​); 
 ​                ​props​.​put​(​"mail.smtp.socketFactory.fallback"​, ​"true"​);  
 ​                 
 ​                ​Session​ ​session​=​Session​.​getDefaultInstance​(​props​, ​new​ ​javax​.​mail​.​Authenticator​() {   
 ​                              ​protected​ ​PasswordAuthentication​ ​getPasswordAuthentication​() {   
 ​                            ​return​ ​new​ ​PasswordAuthentication​(​sender​,​pass​);   
 ​                              }   
 ​                            });  
 ​                ​//session.setDebug(true); 
 ​                ​try 
 ​                { 
 ​                        ​MimeMessage​ ​msg​=​new​ ​MimeMessage​(​session​); 
 ​                        ​msg​.​setFrom​(​new​ ​InternetAddress​(​sender​)); 
 ​                        ​msg​.​setRecipient​(​Message​.​RecipientType​.​TO​,​new​ ​InternetAddress​(​receiver​)); 
 ​                        ​msg​.​setSubject​(​subject​); 
 ​                        ​msg​.​setText​(​message​); 
 ​                         
 ​                        ​Transport​.​send​(​msg​); 
 ​                        ​return​ ​true​; 
 ​                } 
 ​                ​catch​(​Exception​ ​e​) 
 ​                { 
 ​                        ​System​.​out​.​println​(​e​); 
 ​                } 
 ​                ​return​ ​false​; 
 ​        } 
 ​         
 ​        ​public​ ​static​ ​void​ ​main​(​String​ ​args​[]) 
 ​        { 
 ​                ​Mailer​ ​mailer​=​new​ ​Mailer​(); 
 ​                ​boolean​ ​status​=​mailer​.​mailSending​(​"knrblj9@gmail.com"​,​"balaji2001"​,​"knrblj@gmail.com"​,​"test"​,​"test mailer"​); 
 ​                ​if​(​status​) 
 ​                        ​System​.​out​.​println​(​"success"​); 
 ​                ​else 
 ​                        ​System​.​out​.​println​(​"false"​); 
 ​        } 
 ​}
[9:14 pm, 07/04/2022] dhanushbuchi526: ​40​ ​sloc​)  ​1.26​ ​KB 
 ​    
 ​import​ ​java​.​util​.*; 
 ​import​ ​javax​.​mail​.*; 
 ​import​ ​javax​.​mail​.​internet​.*; 
  
 ​public​ ​class​ ​SampleMail​ { 
  
 ​        ​public​ ​static​ ​void​ ​main​(​String​[] ​args​)  
 ​        { 
 ​                ​String​ ​host​ = ​"smtp.gmail.com"​; 
 ​                ​String​ ​user​=​"knrblj9@gmail.com"​; 
 ​                ​String​ ​pass​=​"balaji2001"​; 
 ​                 
 ​                ​String​ ​receiver​=​"knrblj@gmail.com"​; 
 ​                 
 ​                ​Properties​ ​props​ = ​new​ ​Properties​(); 
 ​                ​props​.​put​(​"mail.smtp.host"​, ​host​); 
 ​                ​props​.​put​(​"mail.smtp.port"​, ​"465"​); 
 ​                ​props​.​put​(​"mail.smtp.ssl.enable"​, ​"true"​); 
 ​                ​props​.​put​(​"mail.smtp.auth"​, ​"true"​); 
 ​                ​props​.​put​(​"mail.smtp.ssl.protocols"​, ​"TLSv1.2"​); 
 ​                ​props​.​put​(​"mail.smtp.socketFactory.fallback"​, ​"true"​);  
  
  
 ​                ​Session​ ​session​ = ​Session​.​getDefaultInstance​(​props​,   
 ​                            ​new​ ​javax​.​mail​.​Authenticator​() {   
 ​                              ​protected​ ​PasswordAuthentication​ ​getPasswordAuthentication​() {   
 ​                            ​return​ ​new​ ​PasswordAuthentication​(​user​,​pass​);   
 ​                              }   
 ​                            });   
 ​        ​session​.​setDebug​(​true​); 
 ​                ​try 
 ​                { 
 ​                        ​MimeMessage​ ​message​=​new​ ​MimeMessage​(​session​); 
 ​                        ​message​.​setFrom​(​new​ ​InternetAddress​(​user​)); 
 ​                        ​message​.​setRecipient​(​Message​.​RecipientType​.​TO​, ​new​ ​InternetAddress​(​receiver​)); 
 ​                        ​message​.​setSubject​(​"Test Mailer"​); 
 ​                        ​message​.​setText​(​"Sent by java file as testing"​); 
 ​                         
 ​                        ​Transport​.​send​(​message​); 
 ​                        ​System​.​out​.​println​(​"Success"​); 
 ​                } 
 ​                ​catch​(​Exception​ ​e​) 
 ​                { 
 ​                        ​System​.​out​.​println​(​e​); 
 ​                } 
 ​        } 
  
 ​}
