package com.example.demo.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.net.InetSocketAddress;

/**
 * 服务启动监听器
 * @ClassName NettyServer
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/5/21 11 30
 * @Version V1.0
 **/
public class NettyServer {

    public void start(InetSocketAddress socketAddress) {

        //new一个主线程组
        NioEventLoopGroup bossGroup = new NioEventLoopGroup(1);
        //new一个工作线程组
        NioEventLoopGroup workGroup = new NioEventLoopGroup(200);

        ServerBootstrap serverBootstrap = new ServerBootstrap()
                .group(bossGroup, workGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(new ServerChannelInitializer())
                .localAddress(socketAddress)
                //设置队列大小
                .option(ChannelOption.SO_BACKLOG, 1024)
                //两小时内没有数据的通信时，TCP会自动发送一个活动探测数据报文
                .childOption(ChannelOption.SO_KEEPALIVE, true);

        //绑定端口，开始接受进来的连接。


    }
}
