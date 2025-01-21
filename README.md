# 3-Assaignment-BlockChain
# khasangaliev_yeskenidr (ERC-20 Token)

## Overview

The `contract` is an ERC-20 standard token deployed on Ethereum or compatible testnets. This token is designed for educational purposes and includes functions for managing and displaying transaction data. The initial supply of the token is set to 2000 tokens.

## Usage

1. **Prerequisites:**
   - Install MetaMask browser extension.
   - Use Remix IDE for development and deployment.
   - Have some Goerli testnet Ether for deploying the contract.

2. **Steps to Deploy the Token:**
   1. Go to [Remix IDE](https://remix.ethereum.org/).
   2. Create a new Solidity file (e.g., `contract.sol`).
   3. Copy the contract code into the new file.
   4. Compile the contract using the "Solidity Compiler" tab.
   5. Go to the "Deploy & Run" tab, select "Injected Provider - MetaMask" as the environment.
   6. Ensure MetaMask is connected to the Ganache testnet.
   7. Click "Deploy", approve the transaction in MetaMask.
   8. Once deployed, you can interact with the contract using the provided functions.


## Demo


### Features:
- ERC-20 token standard implementation
- Track and display transaction details (sender, receiver, amount, and timestamp)
- Retrieve the latest transaction's block timestamp in human-readable format
- Retrieve sender and receiver addresses for transactions

---

## Examples

1. **Get Transaction Sender:**
   ```solidity
   contractInstance.getTransactionSender();

## Project Structure

- **`contract`**: Smart contract source code.
- **`README.md`**: This documentation file.
- **`LICENSE`**: Open-source license file (MIT).

---

## Deployment Instructions

### Prerequisites:
- **MetaMask** wallet installed and configured.
- **Ganache** setup for deployment.
- Ethereum testnet (e.g., Remix, Sepolia, Mumbai).