FROM docker-registry-iris.groupement.systeme-u.fr/iris-onbuild/springboot:openjdk11-ubi7

LABEL MAINTAINER="claude.croguennoc@systeme-u.fr"

ENV MAIN_CLASS=fr.su.smartnewsadmin.SmartnewsAdminApplication

USER root

RUN mkdir $WORKDIR/tokens
RUN chown -R ${USERAPP}:${GROUPAPP} $WORKDIR/tokens && \
    chmod -R 750 $WORKDIR/tokens

USER 1000:1000