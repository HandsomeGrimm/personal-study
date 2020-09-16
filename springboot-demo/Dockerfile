#镜像出处
FROM openjdk:8-jdk
#openjdk:8-jdk
#维护者信息
MAINTAINER Grimm
#镜像操作指令
#在容器的根目录中创建spring-cloud文件夹
RUN mkdir -p /work
#将本地项目jar包拷贝到Docker容器中的位置
COPY target/springboot-demo-1.0-SNAPSHOT.jar /work/springboot-demo.jar

#将本地的可执行文件拷贝到Docker容器中的根目录下
#COPY ./app-entrypoint.sh /
#给app-entrypoint.sh赋予可执行权限
#RUN chmod +x /app-entrypoint.sh

#系统编码
ENV LANG=C.UTF-8 LC_ALL=C.UTF-8

#声明一个挂载点，容器内此路径会对应宿主机的某个文件夹
VOLUME /work

#对外暴漏的端口号
EXPOSE 8090
#开机启动
ENTRYPOINT ["java","-jar","/work/springboot-demo.jar"]