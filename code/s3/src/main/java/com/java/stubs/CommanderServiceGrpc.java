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
public final class CommanderServiceGrpc {

  private CommanderServiceGrpc() {}

  public static final String SERVICE_NAME = "CommanderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.java.stubs.Services.MissileAlert,
      com.java.stubs.Services.Status> getMissileApproachingSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "missile_approaching_subscription",
      requestType = com.java.stubs.Services.MissileAlert.class,
      responseType = com.java.stubs.Services.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.java.stubs.Services.MissileAlert,
      com.java.stubs.Services.Status> getMissileApproachingSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.java.stubs.Services.MissileAlert, com.java.stubs.Services.Status> getMissileApproachingSubscriptionMethod;
    if ((getMissileApproachingSubscriptionMethod = CommanderServiceGrpc.getMissileApproachingSubscriptionMethod) == null) {
      synchronized (CommanderServiceGrpc.class) {
        if ((getMissileApproachingSubscriptionMethod = CommanderServiceGrpc.getMissileApproachingSubscriptionMethod) == null) {
          CommanderServiceGrpc.getMissileApproachingSubscriptionMethod = getMissileApproachingSubscriptionMethod = 
              io.grpc.MethodDescriptor.<com.java.stubs.Services.MissileAlert, com.java.stubs.Services.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CommanderService", "missile_approaching_subscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.java.stubs.Services.MissileAlert.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.java.stubs.Services.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new CommanderServiceMethodDescriptorSupplier("missile_approaching_subscription"))
                  .build();
          }
        }
     }
     return getMissileApproachingSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.java.stubs.Services.current_status,
      com.java.stubs.Services.Empty> getCommanderChangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "commander_change",
      requestType = com.java.stubs.Services.current_status.class,
      responseType = com.java.stubs.Services.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.java.stubs.Services.current_status,
      com.java.stubs.Services.Empty> getCommanderChangeMethod() {
    io.grpc.MethodDescriptor<com.java.stubs.Services.current_status, com.java.stubs.Services.Empty> getCommanderChangeMethod;
    if ((getCommanderChangeMethod = CommanderServiceGrpc.getCommanderChangeMethod) == null) {
      synchronized (CommanderServiceGrpc.class) {
        if ((getCommanderChangeMethod = CommanderServiceGrpc.getCommanderChangeMethod) == null) {
          CommanderServiceGrpc.getCommanderChangeMethod = getCommanderChangeMethod = 
              io.grpc.MethodDescriptor.<com.java.stubs.Services.current_status, com.java.stubs.Services.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CommanderService", "commander_change"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.java.stubs.Services.current_status.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.java.stubs.Services.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new CommanderServiceMethodDescriptorSupplier("commander_change"))
                  .build();
          }
        }
     }
     return getCommanderChangeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommanderServiceStub newStub(io.grpc.Channel channel) {
    return new CommanderServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommanderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CommanderServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommanderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CommanderServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CommanderServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void missileApproachingSubscription(com.java.stubs.Services.MissileAlert request,
        io.grpc.stub.StreamObserver<com.java.stubs.Services.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getMissileApproachingSubscriptionMethod(), responseObserver);
    }

    /**
     */
    public void commanderChange(com.java.stubs.Services.current_status request,
        io.grpc.stub.StreamObserver<com.java.stubs.Services.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCommanderChangeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMissileApproachingSubscriptionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.java.stubs.Services.MissileAlert,
                com.java.stubs.Services.Status>(
                  this, METHODID_MISSILE_APPROACHING_SUBSCRIPTION)))
          .addMethod(
            getCommanderChangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.java.stubs.Services.current_status,
                com.java.stubs.Services.Empty>(
                  this, METHODID_COMMANDER_CHANGE)))
          .build();
    }
  }

  /**
   */
  public static final class CommanderServiceStub extends io.grpc.stub.AbstractStub<CommanderServiceStub> {
    private CommanderServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommanderServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommanderServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommanderServiceStub(channel, callOptions);
    }

    /**
     */
    public void missileApproachingSubscription(com.java.stubs.Services.MissileAlert request,
        io.grpc.stub.StreamObserver<com.java.stubs.Services.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMissileApproachingSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void commanderChange(com.java.stubs.Services.current_status request,
        io.grpc.stub.StreamObserver<com.java.stubs.Services.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCommanderChangeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CommanderServiceBlockingStub extends io.grpc.stub.AbstractStub<CommanderServiceBlockingStub> {
    private CommanderServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommanderServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommanderServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommanderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.java.stubs.Services.Status missileApproachingSubscription(com.java.stubs.Services.MissileAlert request) {
      return blockingUnaryCall(
          getChannel(), getMissileApproachingSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.java.stubs.Services.Empty commanderChange(com.java.stubs.Services.current_status request) {
      return blockingUnaryCall(
          getChannel(), getCommanderChangeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CommanderServiceFutureStub extends io.grpc.stub.AbstractStub<CommanderServiceFutureStub> {
    private CommanderServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommanderServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommanderServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommanderServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.java.stubs.Services.Status> missileApproachingSubscription(
        com.java.stubs.Services.MissileAlert request) {
      return futureUnaryCall(
          getChannel().newCall(getMissileApproachingSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.java.stubs.Services.Empty> commanderChange(
        com.java.stubs.Services.current_status request) {
      return futureUnaryCall(
          getChannel().newCall(getCommanderChangeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MISSILE_APPROACHING_SUBSCRIPTION = 0;
  private static final int METHODID_COMMANDER_CHANGE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CommanderServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CommanderServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MISSILE_APPROACHING_SUBSCRIPTION:
          serviceImpl.missileApproachingSubscription((com.java.stubs.Services.MissileAlert) request,
              (io.grpc.stub.StreamObserver<com.java.stubs.Services.Status>) responseObserver);
          break;
        case METHODID_COMMANDER_CHANGE:
          serviceImpl.commanderChange((com.java.stubs.Services.current_status) request,
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

  private static abstract class CommanderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommanderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.java.stubs.Services.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CommanderService");
    }
  }

  private static final class CommanderServiceFileDescriptorSupplier
      extends CommanderServiceBaseDescriptorSupplier {
    CommanderServiceFileDescriptorSupplier() {}
  }

  private static final class CommanderServiceMethodDescriptorSupplier
      extends CommanderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CommanderServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CommanderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CommanderServiceFileDescriptorSupplier())
              .addMethod(getMissileApproachingSubscriptionMethod())
              .addMethod(getCommanderChangeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
