# Microservices Logging

See Youtube Tutorial
https://www.youtube.com/watch?v=vZQMoY_2_AA&lc=z234wdibgpyqx5eegacdp4315odufqdhlffzvgivd2hw03c010c

# Introduction

Let us see how to configure and use ELK Stack in other words ElasticSearch Logstash and Kibana for application logging

A major challenge in a distributed system (e.g. a system landscape of microservices) is to understand what is going on and even more importantly – what is going wrong, where and why. In this blog post we will see how we can use the ELK stack (i.e. Elasticsearch, Logstash and Kibana, ) from Elastic to aggregate log events from our microservices

There are lot of tools which can do the magic if used properly used together. One such popular set of tools are Elastic Search, Logstash and Kibana

ELK stack is a great open source stack for log aggregation and analytics

# Downloads

https://www.elastic.co/downloads/elasticsearch

https://www.elastic.co/downloads/kibana

https://www.elastic.co/downloads/logstash

# Logstash Configuration Document

https://elastic.co/guide/en/logstash/current/configuration.html

# What is ELK?
ElasticSearch - is a NoSQL database and distributed search and analytics engine
if you look at the benefits
easy installation and use
a powerful internal search technology (build using Apache Lucene)
a restful web interface
open source
noSQL (schema free json documents)

Logstash - is a log shipping and parsing service in other words its a transportation pipeline used to populate elastic search with data
benefits
open source tool
collects, parse and stores logs for futiure
its a log aggregator
open source

Kibana - a web interface that connects users wit the elasticSearchDatabase and enables visualization and search options for system operation users
benefits
open source data visualization
you can create graphical representation with logs very easily. even beginners can execute powerful log searches easily

ELK stack is getting quite popular nowadays with a very large open source community

![title](https://github.com/SimpleProgramming/microservice-logging/blob/master/Screen%20Shot%202019-03-26%20at%206.04.36%20PM.png)

If you have to compare Splunk with ELK - actually both are very good log platforms

Splunk actually edges out ELK because of the less configuration needed to configure in Splunk forwarders, when compared to Beats and Logstash in ELK

The ELK Stack is popular because it fulfills a need in the log analytics space. Splunk’s enterprise software has long been the market leader, but its numerous functionalities are increasingly not worth the expensive price. 
ELK is a simple but robust log analysis platform that costs a fraction of the price.

But cost is huge factor nowadays, and the real question you should be asking is if you need all the features of the spunk for the kind of money you are paying ?

Ultimately, for ay small or medium enterprise having a low budget cost can go for ELK, and large enterprises should chooses splunk over ELK

or you would like to get it done for a less cost using ELK

Splunk is used by Adobe, CISCO, Symantec, Coca-cola, etc

ELK is used by StackOverflow, LinkedIn, NetFlix, OpenStack, Medium.com, Accenture, etc

