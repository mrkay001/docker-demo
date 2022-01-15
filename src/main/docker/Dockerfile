# 依赖java 8 编译
FROM openjdk:8-jdk-alpine
# 将所有 jar 包都添加进来,并命别名为docker-demo.jar
ADD *.jar docker-demo.jar
# 入口,执行java -jar 启动项目
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/.urandom","-jar","/docker-demo.jar"]