password-security-example-app
=============================

**URL**

*Generate random password*

/randomPassword

/randomPassword?length=:length

* **Method:**

    `GET`

* **URL Params**

     **Optional:**

       `length=[integer]`

  * **Success Response:**

        **Code:** 200 <br />
        **Content:** `<$J86`
    
  * **Sample Call:**
  
    <a href="http://localhost:8080/randomPassword" target="_blank">http://localhost:8080/randomPassword</a> => .X!9
        
    <a href="http://localhost:8080/randomPassword?length=56" target="_blank">http://localhost:8080/randomPassword?length=56</a> => *prr08>3-1Y?=1,<)9@g:?i@i)'@:3d1<%84>m()8*:7@2@65>.=8q8@
        
**URL**

*Generate a list with fake passwords and the user password. The list is stored temporarily in the service.*

/createHoneyPasswordList?password=:password

/createHoneyPasswordList?password=:password&number=:number

* **Method:**

    `GET`

* **URL Params**

      **Required:**
 
      `password=[string]`
   

      **Optional:**

      `number=[integer]`

  * **Success Response:**

        **Code:** 200 <br />
        **Content:** `[
        "rXAapcBxTMOsHPLxM4v+PfBdbcfF999jQqvvRce3k2XR8cSRgzBsAMlyEvC5ZzFRAirgISX65vyzrgwwnIpS57QR1+ky9p1PFCDmkDbuqCDlWfVoPW/zGicXIHT4biKdBDxEwHZ4akPolexoBcNYv3IDnqZYTj3HwpW77HnyCrCaSWsXBUehQg==",
        "mei6iM0e87klUS8POnboSZ8ZVmCF5XVnY8H6YJhvVSbUK9Rzv9iXDLJCVjetjPCqeccpF2fhlT/YTO2Dms/FPw
        wLXNxYsCNHttsuGalMQ9f646LxPXWzMv5EYRC2EyjdQtJGi05FRy/Lgu5DVQwUY8nxDsFyXQ/NvfSyJcUndRg=",
        "Ve6qaS+zvuDUCkK
        fnEq2ApIipg6y7Ok6f3dw7nNh2WBcg7RmY5mdqeJMjsNTAesGkxcaGmdu6NZDUySE0hXispXdoTWABvRDCPejBcoQQaUI37QumgpH9R/F31DE6E5JT1VOSG13i4lqrjfRqZbxgHlZWBGaNBlK1hPnb5bReTcbrkiRTqRsLQ==","pbZs56agoW/ltFmCFVDe3UV8OQlUAkFzXPxTKla4G1cZ92vKKzS8SN6H2TGOF8UcJ7O6QrRG1iBLnsJ2LxpMWZFV9A4wk8UhSAb1URKWPa/VxSr4pfBOXf45oxdTspNHjK3meTAi7C/rieVn3wgIeNGegJC6f/7PBwgsvJIVcC4="
        ]`
    
  * **Sample Call:**

     <a href="http://localhost:8080/createHoneyPasswordList?password=password" target="_blank">http://localhost:8080/createHoneyPasswordList?password=password</a> => `[
        "rXAapcBxTMOsHPLxM4v+PfBdbcfF999jQqvvRce3k2XR8cSRgzBsAMlyEvC5ZzFRAirgISX65vyzrgwwnIpS57QR1+ky9p1PFCDmkDbuqCDlWfVoPW/zGicXIHT4biKdBDxEwHZ4akPolexoBcNYv3IDnqZYTj3HwpW77HnyCrCaSWsXBUehQg==",
        "mei6iM0e87klUS8POnboSZ8ZVmCF5XVnY8H6YJhvVSbUK9Rzv9iXDLJCVjetjPCqeccpF2fhlT/YTO2Dms/FPw
        wLXNxYsCNHttsuGalMQ9f646LxPXWzMv5EYRC2EyjdQtJGi05FRy/Lgu5DVQwUY8nxDsFyXQ/NvfSyJcUndRg=",
        "Ve6qaS+zvuDUCkK
        fnEq2ApIipg6y7Ok6f3dw7nNh2WBcg7RmY5mdqeJMjsNTAesGkxcaGmdu6NZDUySE0hXispXdoTWABvRDCPejBcoQQaUI37QumgpH9R/F31DE6E5JT1VOSG13i4lqrjfRqZbxgHlZWBGaNBlK1hPnb5bReTcbrkiRTqRsLQ==","pbZs56agoW/ltFmCFVDe3UV8OQlUAkFzXPxTKla4G1cZ92vKKzS8SN6H2TGOF8UcJ7O6QrRG1iBLnsJ2LxpMWZFV9A4wk8UhSAb1URKWPa/VxSr4pfBOXf45oxdTspNHjK3meTAi7C/rieVn3wgIeNGegJC6f/7PBwgsvJIVcC4="
        ]`
        
     <a href="http://localhost:8080/createHoneyPasswordList?password=password&number=2" target="_blank">http://localhost:8080/createHoneyPasswordList?password=password&number=2</a> => `[
"gMH4m1hL4gQlUS8POnboSZ8ZVmCF5XVnY8H6YJhvVSbUK9Rzv9iXDLJCVjetjPCqeccpF2fhlT/YTO2Dms/FPwwLXNxYsCNHttsuGalMQ9f646LxPXWzMv5EYRC2EyjdQtJGi05FRy/Lgu5DVQwUY8nxDsFyXQ/NvfSyJcUndRg=",
"V/ce9wbXmI1D1KMH1AmyJk0lBjCB3G8chW5NqkjQkD8AR0oOA4hdrdhGcsG4W/0GEGVQIX2aefof4XXYiBXZCnE1XJzy1taYnJyHDOWLcn2yT0tzsD9qKIO9s7tQ7Svx9kPVspn/xiYhrGASNZaqbVgm2HA/5pXmlNPAFgXE9nA="
]`

**URL**

*Check the password with list from {@link createHoneyPasswordList}*

/checkPassword?password=:password

* **Method:**

    `GET`

* **URL Params**

     **Optional:**

       `password=[string]`

  * **Success Response:**

        **Code:** 200 <br />
        **Content:** `true`
    
  * **Sample Call:**
  
    <a href="http://localhost:8080/checkPassword?password=password" target="_blank">http://localhost:8080/checkPassword?password=password</a> => true
        
    <a href="http://localhost:8080/checkPassword?password=password2" target="_blank">http://localhost:8080/checkPassword?password=password2</a> => false



