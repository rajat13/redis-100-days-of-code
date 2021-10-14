# Local Redis Cluster Using Docker-Compose

### Starting the Redis Cluster
```docker-compose up```

### Log In to terminal of one of the nodes
```docker ps```  
```docker exec -it <container-name> /bin/sh```

### Log In to redis-cli using the password defined in docker-compose.yaml
```redis-cli -a bitnami```

### Check cluster status
```cluster info```   
```cluster status```   

### Execute basic redis commands
```SET <key> <value>```   
```GET <key>```
