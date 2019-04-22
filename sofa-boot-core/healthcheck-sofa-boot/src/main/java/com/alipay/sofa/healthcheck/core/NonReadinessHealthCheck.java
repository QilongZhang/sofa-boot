/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.sofa.healthcheck.core;

/**
 * Used to mark a {@link HealthChecker} or {@link org.springframework.boot.actuate.health.HealthIndicator}
 * to be skip during readiness health check.
 *
 * @author qilong.zql
 * @since 2019/04/22
 */
public interface NonReadinessHealthCheck {
}