FROM python:3.6

RUN mkdir -p /usr/src/app/static
WORKDIR /usr/src/app

ENV PYTHONDONTWRITEBYTECODE 1

COPY ./requirements.txt .
RUN apt-get update && \
    apt-get install -y mysql-client libmysqlclient-dev && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/* && \
    pip3 install --no-cache-dir -r ./requirements.txt

ADD . /usr/src/app
