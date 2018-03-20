# Simple-blockchain
### *an easy blockchain implementation using rest, built on java*

## Getting started:

Clone the repository.

`git clone https://github.com/leonardobork/simple-blockchain.git`

Install dependencies.

```
cd simple-blockchain

mvn clean install 
```

Run your node:

`java -jar ./target/blockchain-0.0.1-SNAPSHOT.jar`

## Controlling the node

### In this implementation *every peer has to be inserted manually into your node* - to do that you must send a post to your node with the path _/peer_ and send the peer url address with a _/send_ in the end.
#### Example:

[POST]
url="http://localhost:9095/peer" 
 // post body = "http://peeraddress:port/send"

### Since there is no mining algorithm, to generate a new block you just have to send a post with the new block's data to your node.
#### Example:

[POST] 
url="http://localhost:9095/mine" 
 // post body = "my block's data!"

### And finally, to get your blockchain's data you have to send a GET to /blocks.
#### Example:

[GET] 
url="http://localhost:9095/blocks"

Response example
```json
[
    {
        "index": 0,
        "previousHash": "0",
        "timestamp": "2018-03-20 15:04",
        "data": "my genesis block!!",
        "hash": "816534932c2b7154836da6afc367695e6337db8a921823784c14378abed4f7d7"
    },
    {
        "index": 1,
        "previousHash": "0",
        "timestamp": "2018-03-20 15:08",
        "data": "data!",
        "hash": "5d0599800fe14fa0702c4c75fcfdfc43ccc911667fa23efa3ef59cd88ec38888"
    }
]

``` 
### This blockchain model is based on [Naivechain](https://github.com/lhartikk/naivechain)

