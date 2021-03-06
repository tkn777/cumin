/*
 * tksCommons
 *
 * Author  : Thomas Kuhlmann (ThK-Systems, https://www.thk-systems.de)
 * License : LGPL (https://www.gnu.org/licenses/lgpl.html)
 */

package de.thksystems.util.concurrent.scalingworkerqueue;

public class DefaultWorkerQueueConfiguration implements WorkerQueueConfiguration {

    public static final long DEFAULT_SLEEP_PERIOD = 500L;
    private static final int DEFAULT_SLEEP_PERIOD_COUNT_ON_ERROR = 20;
    public static final long DEFAULT_DISPATCHER_WAIT_PERIOD_EMPTY_FETCH = 5_000L;
    public static final int DEFAULT_COUNT_OF_ELEMENT_PER_RUNNER = 2;
    public static final int DEFAULT_MIN_ELEMENTS_COUNT_TO_SUPPLY = 10;
    public static final int DEFAULT_MAX_RUNNER_COUNT = 10;
    public static final int DEFAULT_MIN_RUNNER_COUNT = 1;
    public static final int DEFAULT_SPARE_ELEMENTS_COUNT_TO_SUPPLY = DEFAULT_COUNT_OF_ELEMENT_PER_RUNNER;
    public static final long DEFAULT_RUNNER_SLEEP_IDLE_PERIOD = 2_500L;
    public static final long DEFAULT_RUNNER_MAX_IDLE_PERIOD = 30_000L;

    @Override
    public long getSleepPeriod() {
        return DEFAULT_SLEEP_PERIOD;
    }

    @Override
    public int getSleepPeriodCountOnError() {
        return DEFAULT_SLEEP_PERIOD_COUNT_ON_ERROR;
    }

    @Override
    public long getDispatcherWaitPeriodOnEmptyFetch() {
        return DEFAULT_DISPATCHER_WAIT_PERIOD_EMPTY_FETCH;
    }

    @Override
    public int getCountOfElementsPerRunner() {
        return DEFAULT_COUNT_OF_ELEMENT_PER_RUNNER;
    }

    @Override
    public int getMinElementsCountToSupply() {
        return DEFAULT_MIN_ELEMENTS_COUNT_TO_SUPPLY;
    }

    @Override
    public int getSpareElementsCountToSupply() {
        return DEFAULT_SPARE_ELEMENTS_COUNT_TO_SUPPLY;
    }

    @Override
    public int getMaxRunnerCount() {
        return DEFAULT_MAX_RUNNER_COUNT;
    }

    @Override
    public int getMinRunnerCount() {
        return DEFAULT_MIN_RUNNER_COUNT;
    }

    @Override
    public long getRunnerSleepIdlePeriod() {
        return DEFAULT_RUNNER_SLEEP_IDLE_PERIOD;
    }

    @Override
    public long getRunnerMaxIdlePeriod() {
        return DEFAULT_RUNNER_MAX_IDLE_PERIOD;
    }

}
