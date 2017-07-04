 Demo project for ShedLock tool : https://github.com/lukas-krecan/ShedLock
 

Build the MySQL database with Docker :
```
 docker-compose rm -f && docker-compose build &&  docker-compose up
```


Launch several instances of the spring boot application with a different @fixedRate value in the DemoScheduler.java class.


Observe in the logs that your scheduled tasks is executed at most once at the same time.
