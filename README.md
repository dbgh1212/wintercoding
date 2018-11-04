# wintercoding

#####  WinterCoding 개발과제 - 웹 에관한 Page입니다.
<br/><br/>
## linux 기준 실행 - ubuntu 16.04 기준
- JDK 설치<br/>
  > $ sudo apt-add-repository ppa:webupd8team/java<br/>
  > $ sudo apt-get update<br/>
  > $ sudo apt-get install oracle-java8-installer


- Tomcat 설치<br/>
  > $ sudo apt-get install tomcat8
  
- eclipse 설치<br/>
  > https://www.eclipse.org/downloads/download.php?file=/oomph/epp/neon/R3/eclipse-inst-linux64.tar.gz
  
- eclipse로 실행<br/>
  > 프로젝트 우클릭 -> run as -> Run on server
  
- war file로 배포 후 실행<br/>
  > eclipse 상에서 프로젝트 우클릭 -> export -> war file
  > tomdat8 아래 webapps폴더에 war file 넣음
  > 터미널에 webapps경로까지 들어간 후 $ sudo service tomcat8 start 입력
  > 홈 path: http://localhost:8080/WinCoding
  
## 외부 lib, taglib 사용
	-apache tiles
	-hibernate-validator
	-bootstrap
	-fontawesome
	-sprng form
	-jstl
	
	
<br/><br/>
