app-backend是***基于LBS的手机组团互动社交平台***的后端部分。采用微服务架构，所有服务包括：
- 活动服务
- 动态服务
- 聊天服务
- 用户服务
- 缓存服务
- 搜索服务
- 推荐服务
- 消息队列服务
# 技术栈
- Spring Cloud
- MySQL
- Redis
- ElasticSearch
- RabbitMQ
- Mahout
# TODO
- [ ] Redis集群
- [ ] HashMap内存标记，减少redis访问
- [ ] Redis分布式锁
- [ ] Redis与MySQL之间的数据一致性
- [ ] 接口幂等性设计
- [ ] 接口限流
- [ ] MySQL读写分离
- [ ] MySQL与ElasticSearch之间的数据一致性
- [ ] RabbitMQ异步操作
- [ ] 分布式事务
- [ ] Jmeter压力测试
- [ ] 通过AES实现JavaScript加密和Java解密