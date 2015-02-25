/**
 * Copyright (c) 2015 Aldebaran Robotics. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be
 * found in the COPYING file.
 * Created by epinault and ekroeger
 */
package com.aldebaran.qi.helper.proxies;

import com.aldebaran.qi.CallError;
import com.aldebaran.qi.Session;
import com.aldebaran.qi.helper.ALProxy;
import java.util.List;
import java.util.Map;
import com.aldebaran.qi.*;

import java.util.List;
/**
* 
* @see <a href="http://doc.aldebaran.lan/doc/master/aldeb-doc/naoqi/peopleperception/albasicawareness.html#albasicawareness">NAOqi APIs for ALBasicAwareness </a>
*
*/
public class ALBasicAwareness extends ALProxy {

    public ALBasicAwareness(Session session) {
        super(session);
    }

    /**
    * Set engagement mode.
    * 
    * @param modeName  Name of the mode
    */
    public void setEngagementMode(String modeName) throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("setEngagementMode", modeName);
        else
            service.call("setEngagementMode", modeName).get();
    }

    /**
    * Force Engage Person.
    * 
    * @param engagePerson  ID of the person as found in PeoplePerception.
    * @return true if the robot succeeded to engage the person, else false.
    */
    public Boolean engagePerson(Integer engagePerson) throws CallError, InterruptedException {
        return (Boolean)service.call("engagePerson", engagePerson).get();
    }

    /**
    * Get status enabled/disabled for Stimulus Detection.
    * 
    * @param stimulusName  Name of the stimulus to check
    * @return Boolean value for status enabled/disabled
    */
    public Boolean isStimulusDetectionEnabled(String stimulusName) throws CallError, InterruptedException {
        return (Boolean)service.call("isStimulusDetectionEnabled", stimulusName).get();
    }

    /**
    * Trigger a custom stimulus.
    * 
    * @param stimulusPosition  Position of the stimulus, in Frame World
    * @return If someone was found, return value is its ID, else it's -1
    */
    public Integer triggerStimulus(List<Float> stimulusPosition) throws CallError, InterruptedException {
        return (Integer)service.call("triggerStimulus", stimulusPosition).get();
    }

    /**
    * Reset all parameters, including enabled/disabled stimulus.
    * 
    */
    public void resetAllParameters() throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("resetAllParameters");
        else
            service.call("resetAllParameters").get();
    }

    /**
    * Get the specified parameter.
    * 
    * @param paramName  "ServoingSpeed" : Speed of servoing head moves, as fraction of max speed
 "LookStimulusSpeed" : Speed of head moves when looking at a stimulus, as fraction of max speed
 "LookBackSpeed" : Speed of head moves when looking back to previous position, as fraction of max speed
 "LookDownSpeed" : Speed of head moves when looking down to check for children, as fraction of max speed
 "TrackingSpeed" : Tracking speed
 "NobodyFoundTimeOut" : timeout to send HumanLost event when no blob is found, in seconds
 "MinTimeTracking" : Minimum Time for the robot to be focused on someone, without listening to other stimuli, in seconds
 "TimeSleepBeforeResumeMS" : Slept time before automatically resuming BasicAwareness when an automatic pause has been made, in milliseconds
 "TimeOutResetHead" : Timeout to reset the head, in seconds
 "AmplitudeYawTracking" : max absolute value for head yaw in tracking, in degrees
 "PeoplePerceptionPeriod" : Period for people perception, in milliseconds
 "SlowPeoplePerceptionPeriod" : Period for people perception in FullyEngaged mode, in milliseconds
 "HeadThreshold" : Yaw threshold for tracking, in degrees
 "BodyRotationThreshold" : Angular threshold for BodyRotation tracking mode, in degrees
 "BodyRotationThresholdNao" : Angular threshold for BodyRotation tracking mode on Nao, in degrees
 "MoveDistanceX" : X Distance for the Move tracking mode, in meters
 "MoveDistanceY" : Y Distance for the Move tracking mode, in meters
 "MoveAngleTheta" : Angle for the Move tracking mode, in degrees
 "MoveThresholdX" : Threshold for the Move tracking mode, in meters
 "MoveThresholdY" : Threshold for the Move tracking mode, in meters
 "MoveThresholdTheta" : Theta Threshold for the Move tracking mode, in degrees
 "MaxDistanceFullyEngaged" : Maximum distance for someone to be tracked for FullyEngaged mode, in meters
 "MaxDistanceNotFullyEngaged" : Maximum distance for someone to be tracked for modes different from FullyEngaged, in meters
 "MaxHumanSearchTime" : Maximum time to find a human after observing stimulous, in seconds
 "DeltaPitchComfortZone" : Pitch width of the comfort zone, in degree
 "CenterPitchComfortZone" : Pitch center of the confort zone, in degree
 "SoundHeight" : Default Height for sound detection, in meters
 "MoveSpeed" : Speed of the robot moves
 "MC_Interactive_MinTime" : Minimum time between 2 contextual moves (when the robot is tracking somebody)
 "MC_Interactive_MaxOffsetTime" : Maximum time that we can add to MC_Interactive_MinTime (when the robot is tracking somebody)
 "MC_Interactive_DistanceXY" : Maximum offset distance in X and Y that the robot can apply when he tracks somebody
 "MC_Interactive_MinTheta" : Minimum theta that the robot can apply when he tracks somebody
 "MC_Interactive_MaxTheta" : Maximum theta that the robot can apply when he tracks somebody
 "MC_Interactive_DistanceHumanRobot" : Distance between the human and the robot
 "MC_Interactive_MaxDistanceHumanRobot" : Maximum distance human robot to allow the robot to move (in MoveContextually mode)
 
    * @return ALValue format for required parameter
    */
    public Object getParameter(String paramName) throws CallError, InterruptedException {
        return (Object)service.call("getParameter", paramName).get();
    }

    /**
    * Set engagement mode.
    * 
    * @return Name of current engagement mode as a string
    */
    public String getEngagementMode() throws CallError, InterruptedException {
        return (String)service.call("getEngagementMode").get();
    }

    /**
    * Set the specified parameter 
    * 
    * @param paramName  "ServoingSpeed" : Speed of servoing head moves, as fraction of max speed
 "LookStimulusSpeed" : Speed of head moves when looking at a stimulus, as fraction of max speed
 "LookBackSpeed" : Speed of head moves when looking back to previous position, as fraction of max speed
 "LookDownSpeed" : Speed of head moves when looking down to check for children, as fraction of max speed
 "TrackingSpeed" : Tracking speed
 "NobodyFoundTimeOut" : timeout to send HumanLost event when no blob is found, in seconds
 "MinTimeTracking" : Minimum Time for the robot to be focused on someone, without listening to other stimuli, in seconds
 "TimeSleepBeforeResumeMS" : Slept time before automatically resuming BasicAwareness when an automatic pause has been made, in milliseconds
 "TimeOutResetHead" : Timeout to reset the head, in seconds
 "AmplitudeYawTracking" : max absolute value for head yaw in tracking, in degrees
 "PeoplePerceptionPeriod" : Period for people perception, in milliseconds
 "SlowPeoplePerceptionPeriod" : Period for people perception in FullyEngaged mode, in milliseconds
 "HeadThreshold" : Yaw threshold for tracking, in degrees
 "BodyRotationThreshold" : Angular threshold for BodyRotation tracking mode, in degrees
 "BodyRotationThresholdNao" : Angular threshold for BodyRotation tracking mode on Nao, in degrees
 "MoveDistanceX" : X Distance for the Move tracking mode, in meters
 "MoveDistanceY" : Y Distance for the Move tracking mode, in meters
 "MoveAngleTheta" : Angle for the Move tracking mode, in degrees
 "MoveThresholdX" : Threshold for the Move tracking mode, in meters
 "MoveThresholdY" : Threshold for the Move tracking mode, in meters
 "MoveThresholdTheta" : Theta Threshold for the Move tracking mode, in degrees
 "MaxDistanceFullyEngaged" : Maximum distance for someone to be tracked for FullyEngaged mode, in meters
 "MaxDistanceNotFullyEngaged" : Maximum distance for someone to be tracked for modes different from FullyEngaged, in meters
 "MaxHumanSearchTime" : Maximum time to find a human after observing stimulous, in seconds
 "DeltaPitchComfortZone" : Pitch width of the comfort zone, in degree
 "CenterPitchComfortZone" : Pitch center of the confort zone, in degree
 "SoundHeight" : Default Height for sound detection, in meters
 "MoveSpeed" : Speed of the robot moves
 "MC_Interactive_MinTime" : Minimum time between 2 contextual moves (when the robot is tracking somebody)
 "MC_Interactive_MaxOffsetTime" : Maximum time that we can add to MC_Interactive_MinTime (when the robot is tracking somebody)
 "MC_Interactive_DistanceXY" : Maximum offset distance in X and Y that the robot can apply when he tracks somebody
 "MC_Interactive_MinTheta" : Minimum theta that the robot can apply when he tracks somebody
 "MC_Interactive_MaxTheta" : Maximum theta that the robot can apply when he tracks somebody
 "MC_Interactive_DistanceHumanRobot" : Distance between the human and the robot
 "MC_Interactive_MaxDistanceHumanRobot" : Maximum distance human robot to allow the robot to move (in MoveContextually mode)
 
    * @param newVal  "ServoingSpeed" : Float in range [0.01;1]
 "LookStimulusSpeed" : Float in range [0.01;1]
 "LookBackSpeed" : Float in range [0.01;1]
 "LookDownSpeed" : Float in range [0.01;1]
 "TrackingSpeed" : Float in range [0.01;10]
 "NobodyFoundTimeOut" : Float > 0
 "MinTimeTracking" : Float in range [0;20]
 "TimeSleepBeforeResumeMS" : Int > 0
 "TimeOutResetHead" : Float in range [0;30]
 "AmplitudeYawTracking" : Float in range [10;120]
 "PeoplePerceptionPeriod" : Int > 1
 "SlowPeoplePerceptionPeriod" : Int > 1
 "HeadThreshold" : Float in range [0;180]
 "BodyRotationThreshold" : Float in range [-180;180]
 "BodyRotationThresholdNao" : Float in range [-180;180]
 "MoveDistanceX" : Float in range [-5;5]
 "MoveDistanceY" : Float in range [-5;5]
 "MoveAngleTheta" : Float in range [-180;180]
 "MoveThresholdX" : Float in range [0;5]
 "MoveThresholdY" : Float in range [0;5]
 "MoveThresholdTheta" : Float in range [-180;180]
 "MaxDistanceFullyEngaged" : Float in range [0.5;5]
 "MaxDistanceNotFullyEngaged" : Float in range [0.5;5]
 "MaxHumanSearchTime" : Float in range [0.1;10]
 "DeltaPitchComfortZone" : Float in range [0;90]
 "CenterPitchComfortZone" : Float in range [-90;90]
 "SoundHeight" : Float in range [0;2]
 "MoveSpeed" : Float in range [0.1;0.55]
 "MC_Interactive_MinTime" : Int in range [0;100]
 "MC_Interactive_MaxOffsetTime" : Int in range [0;100]
 "MC_Interactive_DistanceXY" : Float in range [0;1]
 "MC_Interactive_MinTheta" : Float in range [-40;0]
 "MC_Interactive_MaxTheta" : Float in range [0;40]
 "MC_Interactive_DistanceHumanRobot" : Float in range [0.1;2]
 "MC_Interactive_MaxDistanceHumanRobot" : Float in range [0.1;3]
 
    */
    public void setParameter(String paramName, Object newVal) throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("setParameter", paramName, newVal);
        else
            service.call("setParameter", paramName, newVal).get();
    }

    /**
    * Set tracking mode.
    * 
    * @param modeName  Name of the mode
    */
    public void setTrackingMode(String modeName) throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("setTrackingMode", modeName);
        else
            service.call("setTrackingMode", modeName).get();
    }

    /**
    * Set tracking mode.
    * 
    * @return Name of current tracking mode as a string
    */
    public String getTrackingMode() throws CallError, InterruptedException {
        return (String)service.call("getTrackingMode").get();
    }

    /**
    * 
    * 
    */
    public Boolean isStatsEnabled() throws CallError, InterruptedException {
        return (Boolean)service.call("isStatsEnabled").get();
    }

    /**
    * 
    * 
    */
    public void clearStats() throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("clearStats");
        else
            service.call("clearStats").get();
    }

    /**
    * 
    * 
    */
    public Boolean isTraceEnabled() throws CallError, InterruptedException {
        return (Boolean)service.call("isTraceEnabled").get();
    }

    /**
    * Exits and unregisters the module.
    * 
    */
    public void exit() throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("exit");
        else
            service.call("exit").get();
    }

    /**
    * Returns the version of the module.
    * 
    * @return A string containing the version of the module.
    */
    public String version() throws CallError, InterruptedException {
        return (String)service.call("version").get();
    }

    /**
    * Just a ping. Always returns true
    * 
    * @return returns true
    */
    public Boolean ping() throws CallError, InterruptedException {
        return (Boolean)service.call("ping").get();
    }

    /**
    * Retrieves the module's method list.
    * 
    * @return An array of method names.
    */
    public List<String> getMethodList() throws CallError, InterruptedException {
        return (List<String>)service.call("getMethodList").get();
    }

    /**
    * Retrieves a method's description.
    * 
    * @param methodName  The name of the method.
    * @return A structure containing the method's description.
    */
    public Object getMethodHelp(String methodName) throws CallError, InterruptedException {
        return (Object)service.call("getMethodHelp", methodName).get();
    }

    /**
    * Retrieves the module's description.
    * 
    * @return A structure describing the module.
    */
    public Object getModuleHelp() throws CallError, InterruptedException {
        return (Object)service.call("getModuleHelp").get();
    }

    /**
    * Wait for the end of a long running method that was called using 'post'
    * 
    * @param id  The ID of the method that was returned when calling the method using 'post'
    * @param timeoutPeriod  The timeout period in ms. To wait indefinately, use a timeoutPeriod of zero.
    * @return True if the timeout period terminated. False if the method returned.
    */
    public Boolean wait(Integer id, Integer timeoutPeriod) throws CallError, InterruptedException {
        return (Boolean)service.call("wait", id, timeoutPeriod).get();
    }

    /**
    * Returns true if the method is currently running.
    * 
    * @param id  The ID of the method that was returned when calling the method using 'post'
    * @return True if the method is currently running
    */
    public Boolean isRunning(Integer id) throws CallError, InterruptedException {
        return (Boolean)service.call("isRunning", id).get();
    }

    /**
    * returns true if the method is currently running
    * 
    * @param id  the ID of the method to wait for
    */
    public void stop(Integer id) throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("stop", id);
        else
            service.call("stop", id).get();
    }

    /**
    * Gets the name of the parent broker.
    * 
    * @return The name of the parent broker.
    */
    public String getBrokerName() throws CallError, InterruptedException {
        return (String)service.call("getBrokerName").get();
    }

    /**
    * Gets the method usage string. This summarises how to use the method.
    * 
    * @param name  The name of the method.
    * @return A string that summarises the usage of the method.
    */
    public String getUsage(String name) throws CallError, InterruptedException {
        return (String)service.call("getUsage", name).get();
    }

    /**
    * Start Basic Awareness.
    * 
    */
    public void startAwareness() throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("startAwareness");
        else
            service.call("startAwareness").get();
    }

    /**
    * Stop Basic Awareness.
    * 
    */
    public void stopAwareness() throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("stopAwareness");
        else
            service.call("stopAwareness").get();
    }

    /**
    * Get the status (started or not) of the module.
    * 
    * @return Boolean value, true if running else false
    */
    public Boolean isAwarenessRunning() throws CallError, InterruptedException {
        return (Boolean)service.call("isAwarenessRunning").get();
    }

    /**
    * Enable/Disable Stimulus Detection.
    * 
    * @param stimulusName  Name of the stimulus to enable/disable
    * @param isStimulusDetectionEnabled  Boolean value: true to enable, false to disable.
    */
    public void setStimulusDetectionEnabled(String stimulusName, Boolean isStimulusDetectionEnabled) throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("setStimulusDetectionEnabled", stimulusName, isStimulusDetectionEnabled);
        else
            service.call("setStimulusDetectionEnabled", stimulusName, isStimulusDetectionEnabled).get();
    }

}
    