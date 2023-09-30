package com.java.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Services.proto")
public final class InterfaceServiceGrpc {

  private InterfaceServiceGrpc() {}

  public static final String SERVICE_NAME = "InterfaceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.java.stubs.Services.UserInput,
      com.java.stubs.Services.Broadcast_Alert_recieved> getInputBroadcastMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "input_broadcast",
      requestType = com.java.stubs.Services.UserInput.class,
      responseType = com.java.stubs.Services.Broadcast_Alert_recieved.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.java.stubs.Services.UserInput,
      com.java.stubs.Services.Broadcast_Alert_recieved> getInputBroadcastMethod() {
    io.grpc.MethodDescriptor<com.java.stubs.Services.UserInput, com.java.stubs.Services.Broadcast_Alert_recieved> getInputBroadcastMethod;
    if ((getInputBroadcastMethod = InterfaceServiceGrpc.getInputBroadcastMethod) == null) {
      synchronized (InterfaceServiceGrpc.class) {
        if ((getInputBroadcastMethod = InterfaceServiceGrpc.getInputBroadcastMethod) == null) {
          InterfaceServiceGrpc.getInputBroadcastMethod = getInputBroadcastMethod = 
              io.grpc.MethodDescriptor.<com.java.stubs.Services.UserInput, com.java.stubs.Services.Broadcast_Alert_recieved>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InterfaceService", "input_broadcast"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.java.stubs.Services.UserInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.java.stubs.Services.Broadcast_Alert_recieved.getDefaultInstance()))
                  .setSchemaDescriptor(new InterfaceServiceMethodDescriptorSupplier("input_broadcast"))
                  .build();
          }
        }
     }
     return getInputBroadcastMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.java.stubs.Services.Empty,
      com.java.stubs.Services.MissileAlert> getMissileInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "missile_info",
      requestType = com.java.stubs.Services.Empty.class,
      responseType = com.java.stubs.Services.MissileAlert.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.java.stubs.Services.Empty,
      com.java.stubs.Services.MissileAlert> getMissileInfoMethod() {
    io.grpc.MethodDescriptor<com.java.stubs.Services.Empty, com.java.stubs.Services.MissileAlert> getMissileInfoMethod;
    if ((getMissileInfoMethod = InterfaceServiceGrpc.getMissileInfoMethod) == null) {
      synchronized (InterfaceServiceGrpc.class) {
        if ((getMissileInfoMethod = InterfaceServiceGrpc.getMissileInfoMethod) == null) {
          InterfaceServiceGrpc.getMissileInfoMethod = getMissileInfoMethod = 
              io.grpc.MethodDescriptor.<com.java.stubs.Services.Empty, com.java.stubs.Services.MissileAlert>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InterfaceService", "missile_info"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.java.stubs.Services.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.java.stubs.Services.MissileAlert.getDefaultInstance()))
                  .setSchemaDescriptor(new InterfaceServiceMethodDescriptorSupplier("missile_info"))
                  .build();
          }
        }
     }
     return getMissileInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.java.stubs.Services.Empty,
      com.java.stubs.Services.Empty> getPrintLayoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "print_layout",
      requestType = com.java.stubs.Services.Empty.class,
      responseType = com.java.stubs.Services.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.java.stubs.Services.Empty,
      com.java.stubs.Services.Empty> getPrintLayoutMethod() {
    io.grpc.MethodDescriptor<com.java.stubs.Services.Empty, com.java.stubs.Services.Empty> getPrintLayoutMethod;
    if ((getPrintLayoutMethod = InterfaceServiceGrpc.getPrintLayoutMethod) == null) {
      synchronized (InterfaceServiceGrpc.class) {
        if ((getPrintLayoutMethod = InterfaceServiceGrpc.getPrintLayoutMethod) == null) {
          InterfaceServiceGrpc.getPrintLayoutMethod = getPrintLayoutMethod = 
              io.grpc.MethodDescriptor.<com.java.stubs.Services.Empty, com.java.stubs.Services.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InterfaceService", "print_layout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.java.stubs.Services.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.java.stubs.Services.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new InterfaceServiceMethodDescriptorSupplier("print_layout"))
                  .build();
          }
        }
     }
     return getPrintLayoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.java.stubs.Services.Soldier_Id,
      com.java.stubs.Services.Status> getStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "status",
      requestType = com.java.stubs.Services.Soldier_Id.class,
      responseType = com.java.stubs.Services.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.java.stubs.Services.Soldier_Id,
      com.java.stubs.Services.Status> getStatusMethod() {
    io.grpc.MethodDescriptor<com.java.stubs.Services.Soldier_Id, com.java.stubs.Services.Status> getStatusMethod;
    if ((getStatusMethod = InterfaceServiceGrpc.getStatusMethod) == null) {
      synchronized (InterfaceServiceGrpc.class) {
        if ((getStatusMethod = InterfaceServiceGrpc.getStatusMethod) == null) {
          InterfaceServiceGrpc.getStatusMethod = getStatusMethod = 
              io.grpc.MethodDescriptor.<com.java.stubs.Services.Soldier_Id, com.java.stubs.Services.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InterfaceService", "status"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.java.stubs.Services.Soldier_Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.java.stubs.Services.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new InterfaceServiceMethodDescriptorSupplier("status"))
                  .build();
          }
        }
     }
     return getStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.java.stubs.Services.Status,
      com.java.stubs.Services.Empty> getSendInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "send_info",
      requestType = com.java.stubs.Services.Status.class,
      responseType = com.java.stubs.Services.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.java.stubs.Services.Status,
      com.java.stubs.Services.Empty> getSendInfoMethod() {
    io.grpc.MethodDescriptor<com.java.stubs.Services.Status, com.java.stubs.Services.Empty> getSendInfoMethod;
    if ((getSendInfoMethod = InterfaceServiceGrpc.getSendInfoMethod) == null) {
      synchronized (InterfaceServiceGrpc.class) {
        if ((getSendInfoMethod = InterfaceServiceGrpc.getSendInfoMethod) == null) {
          InterfaceServiceGrpc.getSendInfoMethod = getSendInfoMethod = 
              io.grpc.MethodDescriptor.<com.java.stubs.Services.Status, com.java.stubs.Services.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InterfaceService", "send_info"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.java.stubs.Services.Status.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.java.stubs.Services.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new InterfaceServiceMethodDescriptorSupplier("send_info"))
                  .build();
          }
        }
     }
     return getSendInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.java.stubs.Services.Empty,
      com.java.stubs.Services.Empty> getGameOverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "game_over",
      requestType = com.java.stubs.Services.Empty.class,
      responseType = com.java.stubs.Services.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.java.stubs.Services.Empty,
      com.java.stubs.Services.Empty> getGameOverMethod() {
    io.grpc.MethodDescriptor<com.java.stubs.Services.Empty, com.java.stubs.Services.Empty> getGameOverMethod;
    if ((getGameOverMethod = InterfaceServiceGrpc.getGameOverMethod) == null) {
      synchronized (InterfaceServiceGrpc.class) {
        if ((getGameOverMethod = InterfaceServiceGrpc.getGameOverMethod) == null) {
          InterfaceServiceGrpc.getGameOverMethod = getGameOverMethod = 
              io.grpc.MethodDescriptor.<com.java.stubs.Services.Empty, com.java.stubs.Services.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InterfaceService", "game_over"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.java.stubs.Services.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.java.stubs.Services.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new InterfaceServiceMethodDescriptorSupplier("game_over"))
                  .build();
          }
        }
     }
     return getGameOverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.java.stubs.Services.Empty,
      com.java.stubs.Services.Empty> getStartCommanderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "start_commander",
      requestType = com.java.stubs.Services.Empty.class,
      responseType = com.java.stubs.Services.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.java.stubs.Services.Empty,
      com.java.stubs.Services.Empty> getStartCommanderMethod() {
    io.grpc.MethodDescriptor<com.java.stubs.Services.Empty, com.java.stubs.Services.Empty> getStartCommanderMethod;
    if ((getStartCommanderMethod = InterfaceServiceGrpc.getStartCommanderMethod) == null) {
      synchronized (InterfaceServiceGrpc.class) {
        if ((getStartCommanderMethod = InterfaceServiceGrpc.getStartCommanderMethod) == null) {
          InterfaceServiceGrpc.getStartCommanderMethod = getStartCommanderMethod = 
              io.grpc.MethodDescriptor.<com.java.stubs.Services.Empty, com.java.stubs.Services.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InterfaceService", "start_commander"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.java.stubs.Services.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.java.stubs.Services.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new InterfaceServiceMethodDescriptorSupplier("start_commander"))
                  .build();
          }
        }
     }
     return getStartCommanderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InterfaceServiceStub newStub(io.grpc.Channel channel) {
    return new InterfaceServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InterfaceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InterfaceServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InterfaceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InterfaceServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class InterfaceServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void inputBroadcast(com.java.stubs.Services.UserInput request,
        io.grpc.stub.StreamObserver<com.java.stubs.Services.Broadcast_Alert_recieved> responseObserver) {
      asyncUnimplementedUnaryCall(getInputBroadcastMethod(), responseObserver);
    }

    /**
     */
    public void missileInfo(com.java.stubs.Services.Empty request,
        io.grpc.stub.StreamObserver<com.java.stubs.Services.MissileAlert> responseObserver) {
      asyncUnimplementedUnaryCall(getMissileInfoMethod(), responseObserver);
    }

    /**
     */
    public void printLayout(com.java.stubs.Services.Empty request,
        io.grpc.stub.StreamObserver<com.java.stubs.Services.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getPrintLayoutMethod(), responseObserver);
    }

    /**
     */
    public void status(com.java.stubs.Services.Soldier_Id request,
        io.grpc.stub.StreamObserver<com.java.stubs.Services.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getStatusMethod(), responseObserver);
    }

    /**
     */
    public void sendInfo(com.java.stubs.Services.Status request,
        io.grpc.stub.StreamObserver<com.java.stubs.Services.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSendInfoMethod(), responseObserver);
    }

    /**
     */
    public void gameOver(com.java.stubs.Services.Empty request,
        io.grpc.stub.StreamObserver<com.java.stubs.Services.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getGameOverMethod(), responseObserver);
    }

    /**
     */
    public void startCommander(com.java.stubs.Services.Empty request,
        io.grpc.stub.StreamObserver<com.java.stubs.Services.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getStartCommanderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInputBroadcastMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.java.stubs.Services.UserInput,
                com.java.stubs.Services.Broadcast_Alert_recieved>(
                  this, METHODID_INPUT_BROADCAST)))
          .addMethod(
            getMissileInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.java.stubs.Services.Empty,
                com.java.stubs.Services.MissileAlert>(
                  this, METHODID_MISSILE_INFO)))
          .addMethod(
            getPrintLayoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.java.stubs.Services.Empty,
                com.java.stubs.Services.Empty>(
                  this, METHODID_PRINT_LAYOUT)))
          .addMethod(
            getStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.java.stubs.Services.Soldier_Id,
                com.java.stubs.Services.Status>(
                  this, METHODID_STATUS)))
          .addMethod(
            getSendInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.java.stubs.Services.Status,
                com.java.stubs.Services.Empty>(
                  this, METHODID_SEND_INFO)))
          .addMethod(
            getGameOverMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.java.stubs.Services.Empty,
                com.java.stubs.Services.Empty>(
                  this, METHODID_GAME_OVER)))
          .addMethod(
            getStartCommanderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.java.stubs.Services.Empty,
                com.java.stubs.Services.Empty>(
                  this, METHODID_START_COMMANDER)))
          .build();
    }
  }

  /**
   */
  public static final class InterfaceServiceStub extends io.grpc.stub.AbstractStub<InterfaceServiceStub> {
    private InterfaceServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InterfaceServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InterfaceServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InterfaceServiceStub(channel, callOptions);
    }

    /**
     */
    public void inputBroadcast(com.java.stubs.Services.UserInput request,
        io.grpc.stub.StreamObserver<com.java.stubs.Services.Broadcast_Alert_recieved> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInputBroadcastMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void missileInfo(com.java.stubs.Services.Empty request,
        io.grpc.stub.StreamObserver<com.java.stubs.Services.MissileAlert> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMissileInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void printLayout(com.java.stubs.Services.Empty request,
        io.grpc.stub.StreamObserver<com.java.stubs.Services.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPrintLayoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void status(com.java.stubs.Services.Soldier_Id request,
        io.grpc.stub.StreamObserver<com.java.stubs.Services.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendInfo(com.java.stubs.Services.Status request,
        io.grpc.stub.StreamObserver<com.java.stubs.Services.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void gameOver(com.java.stubs.Services.Empty request,
        io.grpc.stub.StreamObserver<com.java.stubs.Services.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGameOverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startCommander(com.java.stubs.Services.Empty request,
        io.grpc.stub.StreamObserver<com.java.stubs.Services.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartCommanderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InterfaceServiceBlockingStub extends io.grpc.stub.AbstractStub<InterfaceServiceBlockingStub> {
    private InterfaceServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InterfaceServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InterfaceServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InterfaceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.java.stubs.Services.Broadcast_Alert_recieved inputBroadcast(com.java.stubs.Services.UserInput request) {
      return blockingUnaryCall(
          getChannel(), getInputBroadcastMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.java.stubs.Services.MissileAlert missileInfo(com.java.stubs.Services.Empty request) {
      return blockingUnaryCall(
          getChannel(), getMissileInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.java.stubs.Services.Empty printLayout(com.java.stubs.Services.Empty request) {
      return blockingUnaryCall(
          getChannel(), getPrintLayoutMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.java.stubs.Services.Status status(com.java.stubs.Services.Soldier_Id request) {
      return blockingUnaryCall(
          getChannel(), getStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.java.stubs.Services.Empty sendInfo(com.java.stubs.Services.Status request) {
      return blockingUnaryCall(
          getChannel(), getSendInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.java.stubs.Services.Empty gameOver(com.java.stubs.Services.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGameOverMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.java.stubs.Services.Empty startCommander(com.java.stubs.Services.Empty request) {
      return blockingUnaryCall(
          getChannel(), getStartCommanderMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InterfaceServiceFutureStub extends io.grpc.stub.AbstractStub<InterfaceServiceFutureStub> {
    private InterfaceServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InterfaceServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InterfaceServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InterfaceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.java.stubs.Services.Broadcast_Alert_recieved> inputBroadcast(
        com.java.stubs.Services.UserInput request) {
      return futureUnaryCall(
          getChannel().newCall(getInputBroadcastMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.java.stubs.Services.MissileAlert> missileInfo(
        com.java.stubs.Services.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getMissileInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.java.stubs.Services.Empty> printLayout(
        com.java.stubs.Services.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getPrintLayoutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.java.stubs.Services.Status> status(
        com.java.stubs.Services.Soldier_Id request) {
      return futureUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.java.stubs.Services.Empty> sendInfo(
        com.java.stubs.Services.Status request) {
      return futureUnaryCall(
          getChannel().newCall(getSendInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.java.stubs.Services.Empty> gameOver(
        com.java.stubs.Services.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGameOverMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.java.stubs.Services.Empty> startCommander(
        com.java.stubs.Services.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getStartCommanderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INPUT_BROADCAST = 0;
  private static final int METHODID_MISSILE_INFO = 1;
  private static final int METHODID_PRINT_LAYOUT = 2;
  private static final int METHODID_STATUS = 3;
  private static final int METHODID_SEND_INFO = 4;
  private static final int METHODID_GAME_OVER = 5;
  private static final int METHODID_START_COMMANDER = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InterfaceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InterfaceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INPUT_BROADCAST:
          serviceImpl.inputBroadcast((com.java.stubs.Services.UserInput) request,
              (io.grpc.stub.StreamObserver<com.java.stubs.Services.Broadcast_Alert_recieved>) responseObserver);
          break;
        case METHODID_MISSILE_INFO:
          serviceImpl.missileInfo((com.java.stubs.Services.Empty) request,
              (io.grpc.stub.StreamObserver<com.java.stubs.Services.MissileAlert>) responseObserver);
          break;
        case METHODID_PRINT_LAYOUT:
          serviceImpl.printLayout((com.java.stubs.Services.Empty) request,
              (io.grpc.stub.StreamObserver<com.java.stubs.Services.Empty>) responseObserver);
          break;
        case METHODID_STATUS:
          serviceImpl.status((com.java.stubs.Services.Soldier_Id) request,
              (io.grpc.stub.StreamObserver<com.java.stubs.Services.Status>) responseObserver);
          break;
        case METHODID_SEND_INFO:
          serviceImpl.sendInfo((com.java.stubs.Services.Status) request,
              (io.grpc.stub.StreamObserver<com.java.stubs.Services.Empty>) responseObserver);
          break;
        case METHODID_GAME_OVER:
          serviceImpl.gameOver((com.java.stubs.Services.Empty) request,
              (io.grpc.stub.StreamObserver<com.java.stubs.Services.Empty>) responseObserver);
          break;
        case METHODID_START_COMMANDER:
          serviceImpl.startCommander((com.java.stubs.Services.Empty) request,
              (io.grpc.stub.StreamObserver<com.java.stubs.Services.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class InterfaceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InterfaceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.java.stubs.Services.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InterfaceService");
    }
  }

  private static final class InterfaceServiceFileDescriptorSupplier
      extends InterfaceServiceBaseDescriptorSupplier {
    InterfaceServiceFileDescriptorSupplier() {}
  }

  private static final class InterfaceServiceMethodDescriptorSupplier
      extends InterfaceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InterfaceServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (InterfaceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InterfaceServiceFileDescriptorSupplier())
              .addMethod(getInputBroadcastMethod())
              .addMethod(getMissileInfoMethod())
              .addMethod(getPrintLayoutMethod())
              .addMethod(getStatusMethod())
              .addMethod(getSendInfoMethod())
              .addMethod(getGameOverMethod())
              .addMethod(getStartCommanderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
